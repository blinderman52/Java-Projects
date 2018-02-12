/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComInterest;

/**
 *
 * @author BLinderman
 */
public class CompoundInterest {
    public static void main(String[] args){
        
        double interestRate = 0.06;
        double presentValue = 200.00;
        double futureValue = 0.0;
        int numOfYears = 1;
        
       
        for(presentValue = 200.00; futureValue <= 400.00; ++numOfYears){
            
        futureValue = presentValue * Math.pow((1 + interestRate), numOfYears);
        }
    
    System.out.println("The number of years to gain $400 is " + numOfYears);
    }
}
