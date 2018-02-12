/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class Person {
    private String FirstName;
    private String MiddleIntial;
    private String LastName;
    private String Gender;
    
    
    public Person()
    {
        FirstName = "N/A";
        MiddleIntial = "N/A";
        LastName = "N/A";
        Gender = "N/A";
        
    }
    
  
    
    public void setName(String name1 , String name2, String name3)
    {
        FirstName = name1;
        MiddleIntial = name2;
        LastName = name3;
        
    }
    
    public String getName()
    {
        return FirstName + LastName + MiddleIntial;
        
    }
    
    public void setGender(String g)
    {
        Gender = g;
        
    }
    
    public String getGender()
    {
        
        return Gender;
    }
    
    
     public String toString()
    {
        
        return String.format("(Name): %-10s, %-10s %-2s (Gender): %-6s", LastName, FirstName, MiddleIntial, Gender);
        
    }
    
}
