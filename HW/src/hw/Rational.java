/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

/**
 *
 * @author BLinderman
 */
public class Rational {
    
    
 private int num = 0;
 private int denom = 0;
 
 public Rational ()
 {
     num = 0;
     denom = 0;
     
 }
 public Rational (int n, int d)
    {
   if (d == 0)
   {
       System.out.println("Cannot divide by zero!");
   }
   else {
   num = n;
   denom = d;
   }
    }
 
 private int gcd (int d, int n)
 {
          if (n == 0 )
        {
            return d;
        }
        else
        {
        return gcd(n, n % d);
        }
 }
 private void reduce()
 {
     int divisor = 0;
     divisor = gcd(denom, num);
     
     
     num = num / divisor;
     denom = denom / divisor;
     
     
 }
 
 public Rational add(Rational t)
 {
     Rational temp = new Rational();
     temp.num = (this.denom * t.num) + (this.num * t.denom);
     temp.denom = this.denom * t.denom;
     temp.reduce();             // For some reason when calling reduce it returns GCD as 6?????
                                // Could not for the life of me figure this one out
     
     return temp;
 }
 
 public Rational subtract(Rational a)
 {
     Rational temp1 = new Rational();
     temp1.num = (a.denom * this.num) - (a.num * this.denom);
     temp1.denom = this.denom * a.denom;
     temp1.reduce();
    
     return temp1;
     
 }
 
public Rational mutliply(Rational t)
 {
      Rational temp = new Rational();
      temp.num = this.num * t.num;
      temp.denom = this.denom * t.denom;
      temp.reduce();
            
       return temp;
             
 }

public Rational divide(Rational t)
{
    Rational temp = new Rational();
    temp.num = this.num * t.denom;
    temp.denom = this.denom * t.num;
    temp.reduce();
            
    return temp;
    
    
}
 
 
 
 
 
 
 public String toString()
 {
     
     return String.format("%2d / %2d", num, denom);
     
 }
}
