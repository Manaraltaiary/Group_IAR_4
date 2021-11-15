/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercyproject251;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MercyProject251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LLAccount Accounts = new LLAccount();
        LLAnimal AnamilsList = new LLAnimal();
        
        System.out.println("-- you have to log in to use any feature in the system --");
        System.out.print("Do you have account ? ");
        String isHasAccount = s.nextLine();
        if(isHasAccount.equalsIgnoreCase("no")){
            System.out.println("\n-- Welcome new register -- please fill your information --\n ");
            System.out.print(" new username : ");
            String username = s.nextLine();
            System.out.print(" new password : ");
            String password = s.nextLine();
            System.out.print(" your name please : ");
            String name = s.nextLine();
            System.out.print(" your phone number : ");
            String phoneNo = s.nextLine();
            PetOwner petOwner = new PetOwner(username,password,name,phoneNo);
            Accounts.add(petOwner);
        }
        System.out.println("  \n------------ Log in --------------\n");
        boolean isLoging = false;
        do{
          System.out.print("Your Username : ");
          String username = s.nextLine();
          System.out.print("Your password : ");
          String password = s.nextLine();
          System.out.print("............................");
       
       if(Accounts.serach(username, password)!=null){
           
         isLoging = true;
           System.out.println("Successfully log in"); 
       }
       else
           System.out.println("Wrong password or username!!!  try again "); 
       
       }while(isLoging==false);
        int userType = s.nextInt();
        int feature;
        switch(userType){
            case 0 :
                System.out.print("What do you want to do As pet Owner\n ---------------------------------");
                System.out.println("    1.Aquire supply\n    2.Offer adoption\n----------------------------------");
                feature = s.nextInt();
                switch(feature){
                    case 1 : 
                         petOwner.aquireSupply(s);
                         System.out.println("petOwners in need :-");
                         System.out.println(petOwner.toString());
                         System.out.println(petOwner.getSupplyDesc());
                         break;
                    case 2 : 
                }
                
            case 1 : 
                System.out.print("What do you want to do As pet A user/n ---------------------------------");
                System.out.println("    1.DisplayAnimals/n    2.Display Animals need supplies/n    3.Donate supply/n----------------------------------");
                feature = s.nextInt();
                switch(feature){
                    case 1 : 
                    case 2 : 
                    case 3 :
                         
                }
                
                
            default : break;
        }
        }
        
        
        //create a  petOwner object request , username for petowner
        
       
        // numbered list (choose a number"pet owner") => 1.petOwner Username description:---------  
        //customer choose 1
        
        
        //fill supply info
           //supply type , name , brief description, Picture(optional)= 1.yes 2.no || customer email, customer phone 
           //the processs is succesfull
           
           
        //create supply object and customer
        //customerUsername = random
        
        //send the object to petOwner Supplysarray
       
       
       
/*
        Scanner s = new Scanner(System.in);
        String command = s.next(); //assigning the coomand read by the scanner into variable named command 
        command=command.toLowerCase(); //converting command to lower case
        do { //loop for reading the file 
            switch (command) { //switch for the variable command if the command matches the statment then excute the method for the named command
                case "add_customer":
//                    add_customer(s, customer, output);
                    /*
                    invoking the method that matches the command and sending
                    the Scanner(s), array (customers) and the printwriter(outout)
                    
                    break;
                case "add_itemname":
//                    add_itemName(s, item, output);
                    break;
              
                }
            command = s.next(); // add the next word in file 
            command=command.toLowerCase();//converted to lower case
            if("quit".equals(command)){
//                    quit(output,s);// invoking quit method after the loop ends
                }
        } while (s.hasNext());// check the condition 
    */
}
    
}
