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
    private int ID;
    private String FirstName;
    private String LastName;
    private double GPA;
    private String Major;
    
    public Student()
    {
        ID = 0;
        FirstName = "N/A";
        LastName = "N/A";
        GPA = 0.0;
        Major = "N/A";
        
    }
    
    public Student(int I, String name1, String name2, double g, String m)
    {
        ID = I;
        FirstName = name1;
        LastName = name2;
        GPA = g;
        Major = m;
        
    }
    public void printInfo()
    {
        System.out.println(ID);
        System.out.println(FirstName + " " + LastName);
        System.out.println(GPA);
        System.out.println(Major);
        
    }
    
    public String toString()
    {
        
        return String.format("(ID): %5d (Name): %-10s, %-10s (GPA): %1.2f (Major): %-15s ", ID, LastName, FirstName, GPA, Major );
        
    }
}
