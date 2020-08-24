import ATM.src.com.sbrf.client.*;
import ATM.src.com.sbrf.DB.*;

public class ATM{
        private Bankdb Bank_db;
        private Client client;

        public ATM(Bankdb Bank_db, Client client){
                this.Bank_db = Bank_db;
                this.client= client;
        }
        private long getAccount(String bank_card_key){
                return Bank_db.get_account(client.client_id, bank_card_key);
        }
        public long getcurrency(String bank_card_key){
                return getAccount(bank_card_key).currency;
        }
        public long getbalance(String bank_card_key){
                return getAccount(bank_card_key).balance;
        }
}