/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class TheMain {
    public static void main (String[] args)
    {
        Person Jeff = new Person();
        Jeff.setName("Jeff", "T", "Johnson");
        Jeff.getName();
        Jeff.setGender("Male");
        Jeff.getGender();
        System.out.println(Jeff.toString());
        
        MilitaryPerson Michael = new MilitaryPerson();
        Michael.setName("Michael", "Q", "Zee");
        Michael.getName();
        Michael.setGender("Male");
        Michael.getGender();
        Michael.getReserve("Reserve");
        Michael.setReserve();
        System.out.println(Michael.toString());
        
        NavySailor Melissa = new NavySailor();
        Melissa.setName("Melissa", "M", "Beckworth" );
        Melissa.getName();
        Melissa.setGender("Female");
        Melissa.getGender();
        Melissa.getActive("Active Duty");
        Melissa.setActive();
        Melissa.getBase("Fort Drum");
        Melissa.setBase();
        Melissa.getSub("Submarine");
        Melissa.setSub();
        Melissa.getDate("01/14/2014");
        Melissa.setDate();
        Melissa.getRank("Private");
        Melissa.setRank();
        System.out.println(Melissa.toString());
        
                
                
                
     }
}
