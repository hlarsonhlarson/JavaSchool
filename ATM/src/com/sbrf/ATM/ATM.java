package com.sbrf.ATM;

import com.sbrf.DB.BankDb;

public class ATM {
    private BankDb BankDb;

    public ATM(BankDb bankDb){
        BankDb = bankDb;
    }

    private long getAccount(String bank_card_key)
    {
        return Bank_db.get_account(bank_card_key);
    }
    public long getcurrency(String bank_card_key){
        return getAccount(bank_card_key).currency;
    }
    public long getbalance(String bank_card_key){
        return getAccount(bank_card_key).balance;
    }
}
