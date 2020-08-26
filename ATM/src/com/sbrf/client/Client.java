package ATM.src.com.sbrf.client;

import ATM.src.com.sbrf.DB.*;
import ATM.src.com.sbrf.ATM.*;

public class Client {
    private String client_id;
    private BankCard;
    private HashMap<String, Account> clients_accounts;

    public Client(){

    }

    public Client(String client_id) {
        this.client_id = client_id
        this.clients_accounts= new HashMap<>();
    }

    public long getAccount(String bank_card_key, String pin){
        try{
            getClientInfo(bank_card_key, pin);
        }
        catch (IOException e){
            System.println("Can't get client account");
        }

    }
}
