/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

/**
 *
 * @author BLinderman
 */
public class HW {

    public static void main(String[] args) {
        
        
         
        
        Rational first = new Rational (1, 4);
        Rational second = new Rational (1, 2);
        Rational answer = new Rational();
        
        answer = second.add(first);
        System.out.printf("%s = %s + %s\n", answer.toString(), first.toString(), second.toString());
        
        
        answer = second.subtract(first);
        System.out.printf("%s = %s - %s\n", answer.toString(), first.toString(), second.toString());

        
        answer = first.mutliply(second);
        System.out.printf("%s = %s * %s\n", answer.toString(), first.toString(), second.toString());
        
        
        answer = first.divide(second);
        System.out.printf("%s = %s / %s\n", answer.toString(), first.toString(), second.toString());

        
    }
    
}
