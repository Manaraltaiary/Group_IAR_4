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
public class LLAnimal {
    private Animal head ;
    
    public LLAnimal(){
        head = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void add(Animal newAnimal){
        if(head==null)
            head = newAnimal;
        else{
            Animal helpPtr = head.next ;
            while(helpPtr!= null){
                helpPtr = helpPtr.next;
            }
           helpPtr.next = newAnimal; 
        }
    }
    public void displayAll(){
        Animal helpPtr = head;
        while(helpPtr != null){
            System.out.println("------------------------------");
            System.out.println(helpPtr.toString());
            helpPtr = helpPtr.next;
        }
    }
}
