package com.sbrf.client;


import com.sbrf.DB.Account;

import java.util.HashMap;

public class Client {
    private String ClientId;
    private BankCard BankCard;
    private HashMap<String, Account> ClientsAccounts;

    public Client(){

    }

    public Client(String clientId, BankCard bankCard, HashMap<String, Account> clientsAccounts) {
        ClientId = clientId;
        ClientsAccounts = clientsAccounts;
        BankCard = bankCard;
    }

    public long getAccount(String bank_card_key, String pin){
    }
}
