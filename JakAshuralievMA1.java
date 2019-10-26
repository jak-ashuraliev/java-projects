/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jakashuralievma1;

/**
 * @author Jak Ashuraliev
 * Component Software / AD 300 / MONDAY
 * Assignment # 1
 * Purpose: Write a method that removes the duplicate elements from an ArrayList of integers
 */
 
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class JakAshuralievMA1 {

    //main method
    public static void main(String[] args) {
        
        //create an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        
        //create a scanner
        Scanner userInput = new Scanner(System.in);
        
        //prompt a user to enter 10 integer numbers
        System.out.print("ENTER TEN INTEGERS: ");
        
        //loop thru the 10 integers and add them to the list
        for (int i = 0; i < 10; i++) {
            list.add(userInput.nextInt());
        }
        
        //call / invoke the removeDuplicate method
        removeDuplicate(list);
       
        //display the distinct numbers 
        System.out.print("THE DISTINCT INTEGERS/NUMBERS ARE: \t\t");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //display integers/value/numbers separated by one space
        }
        System.out.println();
        
        System.out.print("SORTED IN ASCENDING: \t\t\t\t");
        Collections.sort(list);
        System.out.println(list);
        
        System.out.print("MAX ELEMENT IN THE LIST: \t\t\t");
        System.out.println(java.util.Collections.max(list));
        
        System.out.print("MIN ELEMENT IN THE LIST: \t\t\t");
        System.out.println(java.util.Collections.min(list));
       
        System.out.print("RANDOM SHUFFLE FOR THE ELEMENTS IN THE LIST: \t");
        Collections.shuffle(list);
        System.out.println(list);
       
    }
   
    
    //create a method that removes the duplicate elements from an arraylist of integers
    public static void removeDuplicate(ArrayList<Integer>list) {
    
        //create a temporary arraylist
        ArrayList<Integer> tempList = new ArrayList<>();
    
        //loop thru the list and check if list contains the same integer/number/value as tempList
        for (int i = 0; i < list.size(); i++) {
            if (!tempList.contains(list.get(i))) {
                tempList.add(list.get(i));
            }
        }
        
        //clear the list
        list.clear();
        
        //add all integers/numbers/value from tempList into list
        list.addAll(tempList);
        
    }
    
}
