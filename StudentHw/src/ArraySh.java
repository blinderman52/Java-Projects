/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLinderman
 */
public class ArraySh {
    // shellSort.java
// demonstrates shell sort
// to run this program: C>java ShellSortApp
//--------------------------------------------------------------

  
   private long[] theArray;          // ref to array theArray
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArraySh(int max)           // constructor
      {
      theArray = new long[max];      // create the array
      nElems = 0;                    // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      theArray[nElems] = value;      // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      System.out.print("A=");
      for(int j=0; j<nElems; j++)    // for each element,
         System.out.print(theArray[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void shellSort()
      {
      int inner, outer;
      long temp;

      int h = 1;                     // find initial value of h
      while(h <= nElems/3)
         h = h*3 + 1;                // (1, 4, 13, 40, 121, ...)

      while(h>0)                     // decreasing h, until h=1
         {
                                     // h-sort the file
         for(outer=h; outer<nElems; outer++)
            {
            temp = theArray[outer];
            inner = outer;
                                     // one subpass (eg 0, 4, 8)
            while(inner > h-1 && theArray[inner-h] >=  temp)
               {
               theArray[inner] = theArray[inner-h];
               inner -= h;
               }
            theArray[inner] = temp;
            
            for (int i = 0; i < theArray.length; i++)
      {
      System.out.print(theArray[i] + " ");
      }
      System.out.println();
      
            }  // end for
         h = (h-1) / 3;              // decrease h
         }  // end while(h>0)
     
      }  // end shellSort()
//--------------------------------------------------------------
   }  // end class ArraySh
////////////////////////////////////////////////////////////////
