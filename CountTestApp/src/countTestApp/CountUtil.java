/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countTestApp;

/**
 * static method to count any Countable objects a specified number of times
 * @author MuendeProfessional
 */
public class CountUtil {
   
   /*
    *passes in the object and number of times to count it
   */
   public static void count(Countable c, int maxCount){
       //while count (starts at 0) is less than number of times to count
       while(c.getCount()<maxCount){
           //increment the count
           c.incrementCount();
           //print the string getCountString method for the specific object
           System.out.println(c.getCountString());
       }
       //reset the counter
       c.resetCount();
   }
}
