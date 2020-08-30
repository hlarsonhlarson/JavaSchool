package com.sbrf.DB;


import com.sbrf.client.BankCard;
import com.sbrf.client.Client;

import java.util.HashMap;

public class BankDb{
   private HashMap<String, Client> client_info;
   private HashMap<BankCard, String> storage_for_biometry;

   public BankDb(){

   }

   public BankDb(HashMap<String, Client> clientInfo, HashMap<BankCard, String> ){

   }
   public Client getClient(String client_id){
   }
}