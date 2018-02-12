/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class StudentDirect {
    public static void main (String [] args)
    {
     
        Graduate Mary = new Graduate(12345, "Mary Williams", 600, 2005);
        UnderGrad Bill = new UnderGrad (23456, "Bill Robinson", 3.546, 1200);
        
        System.out.println(Mary.toString());
        System.out.println(Bill.toString());
        
        
        
        
    }
}
