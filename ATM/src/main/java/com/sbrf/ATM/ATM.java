package com.sbrf.ATM;

import com.sbrf.DB.BankDb;
import com.sbrf.DB.ErrorCode;
import com.sbrf.DB.ErrorMessages;
import com.sbrf.client.AccesDevice;

import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private BankDb BankDb;
    private long   ATMMoney;
    private HashMap<String, AccesDevice> accessDevices;

    public ATM(BankDb bankDb, long atmMoney, HashMap<String, AccesDevice> AccessDevices){
        BankDb = bankDb;
        ATMMoney = atmMoney;
        accessDevices = AccessDevices;
    }

    private AccesDevice getDevice(String deviceName){
        if (accessDevices.containsKey(deviceName)) {
            return accessDevices.get(deviceName);
        }
        else{
            throw new ErrorMessages(ErrorCode.NoAccessDevice);
        }
    }

    public void atmLogin(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose access device");
        try {
            AccesDevice accesDevice = getDevice(scanner.next());
        }
        catch (ErrorMessages exception){
            System.out.println("No such device, please try another");
            atmLogin();
        }
        System.out.println("Enter your key");
    }
}
