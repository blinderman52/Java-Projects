/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class UnderGrad extends Student {
    private double GPA;
    private int SATScore;
    
    public UnderGrad (int sID, String n, double g, int SAT)
    {
        super(sID, n);
        GPA = g;
        SATScore = SAT;
        
    }
    
    
    public String toString ()
    {
        
        return String.format("%s (UnderGraduate) ----- %5.3f ----- %4d", super.toString(), GPA, SATScore);
        
    }
}
