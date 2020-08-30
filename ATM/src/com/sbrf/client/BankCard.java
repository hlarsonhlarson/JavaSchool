package com.sbrf.client;

import java.util.Date;

public class BankCard{
    private String PIN;
    private String BankCardNumber;
    private Date ExpireDate;

    public BankCard(){

    }
    public BankCard(String pin, String bankCardNumber, Date expireDate){
        PIN = pin;
        BankCardNumber = bankCardNumber;
        ExpireDate = expireDate;
    }
}