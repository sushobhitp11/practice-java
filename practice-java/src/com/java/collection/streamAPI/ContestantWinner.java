package com.java.collection.streamAPI;

public class ContestantWinner {

      private String name;
      private String phoneNo;

      public ContestantWinner(String name, String phoneNo){
          this.phoneNo = phoneNo;
          this.name = name;

      }
      public String getName(){
          return name;
      }
      public String getPhoneNo(){
          return phoneNo;
      }
}
