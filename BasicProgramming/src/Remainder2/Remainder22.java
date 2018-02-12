/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remainder2;

/**
 *
 * @author BLinderman
 */
import java.util.Scanner;

public class Remainder22 {
    public static void main (String[] args) 
    {
        int userNum = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter an integer: ");
        userNum = input.nextInt();
        
        int testNum = 0;
        testNum = userNum / 2;
        testNum = testNum * 2;
        
       if(testNum == userNum){
            System.out.println("The number is even.");
       }
         else {
           System.out.println("The number is odd.");
    }
          
    }
}