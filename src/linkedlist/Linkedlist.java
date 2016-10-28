/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Kamau
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         LinkedList <Integer> Names =new LinkedList<Integer>();
        LinkedList <String> Name =new LinkedList<String>();
        Names.add(5);
        Names.add(56);
        Names.add(789);
        Names.add(7);
        Names.add(59);
        Names.add(79);
        Names.remove(1);// removing
       
        Name.add("Wakenya");
        Name.add("Waganda");
        Name.add("Wasudanise");
        Name.add("Wakale");
        
       // Name.remove("Wasudanise");
         
        Collections.sort(Name);//these sorting in assendtion
        Collections.sort(Names);// arrange in desending
        Collections.reverse(Names);// 
        System.out.println(Names);
        System.out.println(Name);
      
// write a linklist to print integers   
        // enhances for loop
    }
    
}
