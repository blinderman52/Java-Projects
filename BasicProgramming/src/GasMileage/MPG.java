/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GasMileage;

/**
 *
 * @author BLinderman
 */
import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
    
        int tankGallons = 0;
        double milesDriven = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many gallons of fuel does your vehicle hold?: ");
        tankGallons = input.nextInt();
        
        System.out.print("Now, enter how many miles you have driven since last fill up: ");
        milesDriven = input.nextDouble();
     
            double milesPerGallon = 0.0;
            milesPerGallon = milesDriven / tankGallons;
            
            System.out.println("Your vehicle gets " + milesPerGallon + " mpg");
    }
    
}