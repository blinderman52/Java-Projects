/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class Student {
    private int studentID;
    private String name;
    
    public Student (int sID, String n)
    {
        studentID = sID;
        name = n;
        
    }
    
    public String toString ()
    {
        return String.format("%5d ----- %-24s", studentID, name);
        
    }
    
    
    
    
    
    
}
