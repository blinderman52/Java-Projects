/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blinderman
 */

import java.io.*;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args)
    {
        int total = 0;
        Scanner fileInput;
        try{
            System.out.println("Openning data file...");
            fileInput = new Scanner(new File("huckleberryfinn.txt"));
            }
        catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        System.out.println( "File opened successfully...");
        System.out.println( "Reading file..." );

        String nextWord;
        
        List theList = new List();
        
        // Read the datafile until your reach the end of file
        while(fileInput.hasNext())
        {
            nextWord = fileInput.next();
            total++;
            theList.updateList(nextWord.toLowerCase());
            
        }
        
        theList.displayList(total);
    }
}
