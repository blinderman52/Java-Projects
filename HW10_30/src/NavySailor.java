/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class NavySailor extends MilitaryPerson {
    private String baseStation;
    private String SurfaceShip;
    private String Submarine;
    private String DateCommish;
    private String Rank;
    
    
    
    public NavySailor()
    {
        baseStation = "N/A";
        SurfaceShip = "N/A";
        Submarine = "N/A";
        DateCommish = "N/A";
        Rank = "N/A";
        
    }
    
    public void getBase(String BS)
    {
        baseStation = BS;
        
    }
    
    public String setBase()
    {
        return baseStation;
        
    }
    
    public void getShip(String s)
    {
        SurfaceShip = s;
        
    }
    
    public String setShip()
    {
        return SurfaceShip;
        
    }
    
    public void getSub(String sm)
    {
        Submarine = sm;
        
    }
    
    public String setSub()
    {
        return Submarine;
        
    }
    
    public void getDate(String d)
    {
        DateCommish = d;
        
    }
    
    public String setDate()
    {
        return DateCommish;
        
    }
    
    public void getRank(String r)
    {
        Rank = r;
        
        
    }
    
    public String setRank()
    {
       return Rank;
        
    }
    
    public String toString()
    {
        
        if(Submarine == "Submarine")
        {
            return String.format("%s (Base): %-24s (Ship or Sub): %9s (Date Enlisted): %-10s (Rank): %10s  ", super.toString(), baseStation, Submarine, DateCommish,Rank);
        }
        else 
        {
            return String.format("%s (Base): %-15s (Ship or Sub): %9s (Date Enlisted): %10s (Rank): %-10s  ", super.toString(), baseStation, SurfaceShip, DateCommish,Rank);
            
        }
        
        
        
    }
}
