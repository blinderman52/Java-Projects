/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9.pkg20;

/**
 *
 * @author BLinderman
 * 
 * 
 */

import java.util.Scanner;

public class Class920 {
    public static void main(String[] args) {
      
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int answer;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first value: ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second value: ");
        num2 = input.nextInt();
        
        System.out.print("Enter the third value: ");
        num3 = input.nextInt();
        
        
        answer = highest(num1, num2, num3);
        
        System.out.println("The largest value between: " + num1 + ", "+ num2 + ", and "  + num3 + " is " + answer + "." );
        
    }
    
    public static int highest(int num1, int num2, int num3)
    {
        return Math.max(num1, Math.max(num2, num3));
        
        
    }
        
        
    }
    

