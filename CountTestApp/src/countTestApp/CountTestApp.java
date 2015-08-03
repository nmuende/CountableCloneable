/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*This app will count Alligator objects 
*and clone and count Sheep objects
*Uses Cloneable interface as well as custom made Countable interface
*Uses CountUtil to display Alligator Objects and count
*Uses CountUtil to display Sheep Objects and count
*Countable class counts any objects
*/
package countTestApp;

/**
 *
 * @author MuendeProfessional
 */
public class CountTestApp {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        
        System.out.println("Counting alligators...");
        System.out.println();
        //create new alligator
        Alligator a1 = new Alligator();
        //set Alligator "name"
        a1.setAlligator("Alligator");
        //call CountUtil class method count passing in alligator object and maxCount
        CountUtil.count(a1,3);
        
        System.out.println();
        System.out.println("Counting sheep...");
        System.out.println();

        //create sheep instance
        Sheep s1 = new Sheep();
        //name sheep Blackie
        s1.setSheep("Blackie");
        //count and display 2 times
        CountUtil.count(s1,2);

        System.out.println();

        //clone Blackie
        Sheep s2 = (Sheep) s1.clone();
        //rename to Dolly
        s2.setSheep("Dolly");
        //Count and display three times
        CountUtil.count(s2,3);
        
        System.out.println();
        
        //count first sheep Blackie one time again
        CountUtil.count(s1,1);
    }
}
