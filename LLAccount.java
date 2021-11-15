/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercyproject251;

/**
 *
 * @author user
 */
public class LLAccount {
        private Account head ;
    
    public LLAccount(){
        head = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void add(Account account){
        if(head==null)
            head = account;
        else{
            Account helpPtr = head.next ;
            while(helpPtr!= null){
                helpPtr = helpPtr.next;
            }
           helpPtr.next = account; 
        }
    }
    public Account serach(String username, String password){
        Account helpPtr = head;
        while(helpPtr!= null){
            if(helpPtr.getUsername().equals(username)&&helpPtr.getPassword().equals(password))
            return helpPtr;
                helpPtr = helpPtr.next;
            }
        return helpPtr;    
    }
    
    public void displayAll(){
        Account helpPtr = head;
        while(helpPtr != null){
   
            helpPtr = helpPtr.next;
        }
    }
}
