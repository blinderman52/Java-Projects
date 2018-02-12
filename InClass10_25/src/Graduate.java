/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class Graduate extends Student {
    private int GMATScore;
    private int yearOfGrad;



    public Graduate (int sID, String n, int gmat, int year)
    {
        super(sID, n);
        GMATScore = gmat;
        yearOfGrad = year;
        
        
    }

    public String toString ()
    {
        
        return String.format("%s (Graduate) ----- %d ----- %4d", super.toString(), GMATScore, yearOfGrad);
        
    }

    
}
