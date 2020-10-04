package com.sbrf.DB;


import com.sbrf.client.BankCard;
import com.sbrf.client.Client;

import java.util.HashMap;

public class BankDb{
   private HashMap<String, Client> client_info;

   public BankDb(){

   }

   public BankDb(HashMap<String, Client> clientInfo){
       client_info = clientInfo;
   }
}