package com.sbrf.DB;


public class Account{
    private long currency;
    private String account_number;

    public Account(){

    }
    public Account(long currency, String account_number){
        this.currency = currency;
        this.account_number = account_number;
    }
}