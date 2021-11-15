/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercyproject251;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PetOwner extends Account{
    private int money;
    private String supplyDesc;
    public PetOwner(String username, String password, String name, String phoneNumber) {
        super(username, password, name, phoneNumber);
    }
    public void aquireSupply(Scanner s){
        System.out.println("Aquire supply");
        System.out.print("Entre supply name: ");
        supplyDesc = s.nextLine();
    }

    public int getMoney() {
        return money;
    }

    public String getSupplyDesc() {
        return supplyDesc;
    }
    
    
    public String toString(){
        
        return ("Name : "+super.getName()+"\nphoneNumber : "+super.getPhoneNumber());
    }
}
