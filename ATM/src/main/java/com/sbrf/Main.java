package com.sbrf;

import  com.sbrf.ATM.ATM;
import com.sbrf.DB.BankDb;
import com.sbrf.client.AccesDevice;
import com.sbrf.client.Client;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Client> clientInfo = new HashMap<>();
        BankDb bankDb = new BankDb(clientInfo);
        long atmMoney = 100000;
        HashMap<String, AccesDevice> accessDevices = new HashMap<>();
        ATM atm = new ATM(bankDb, atmMoney, accessDevices);
        atm.atmLogin();
    }

}