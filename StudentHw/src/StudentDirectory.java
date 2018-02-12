/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class StudentDirectory {
    public static void main (String[] args)
    {
        Student Adrain = new Student(12345, "Adrain", "Peterson", 3.5, "Communications");
        System.out.println(Adrain.toString());
        
        
        Student Kaylee = new Student(565846, "Kaylee", "McCay", 3.0, "ABA");
        System.out.println(Kaylee.toString());
        
        
    }
}
