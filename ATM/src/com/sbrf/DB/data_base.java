package ATM.src.com.sbrf.DB;

import ATM.src.com.sbrf.client.*;
import ATM.src.com.sbrf.ATM.*;

public class Bankdb{
   private HashMap<String, Client> client_info;
   private HashMap<BankCard, String> storage_for_biometry;

   public Client getClient(String client_id){
      try{
          return client_info.get(client_id);
      }
      catch{
         System.println("Can't get client");
      }
   }
}