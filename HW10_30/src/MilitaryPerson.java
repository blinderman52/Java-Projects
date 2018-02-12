/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class MilitaryPerson extends Person {
    private String activeDuty;
    private String Reserve;
    
    
    MilitaryPerson()
    {
        activeDuty = "N/A";
        Reserve = "N/A";
        
    }
    
    public void getActive(String a)
    {
        
            activeDuty = a;
      
        
    }
    
    public void getReserve(String r)
    {
        
        Reserve = r;
        
    }
    
    public String setActive()
    {
        return activeDuty;
        
    }
    
    public String setReserve()
    {
        return Reserve;
        
    }
    
    
    
    public String toString()
    {
       if (Reserve == "Reserve")
       {
        return String.format("%s (Active or Reserve): %-7s", super.toString(), Reserve);
       }
       else
       {
           return String.format("%s (Active or Reserve): %-7s", super.toString(), activeDuty);
       }
    }
    
}
