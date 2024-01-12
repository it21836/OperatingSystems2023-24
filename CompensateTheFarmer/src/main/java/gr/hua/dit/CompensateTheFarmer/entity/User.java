package gr.hua.dit.CompensateTheFarmer.entity;

public class User {
   private String userId; //primary key
   private String userName;
   private String password;
   private String fullname;
   private String role;

   static boolean login(){
       //TODO
       //verify farmer or send error message
       return true;
   };

   static boolean verifyLogin(){
       //TODO
       return true;
   }


}
