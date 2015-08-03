/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countTestApp;

import java.text.NumberFormat;
/**
 * implements Countable interface
 * instance variable stores count
 * method to return formatted count
 * @author MuendeProfessional
 */
public class Sheep implements Countable, Cloneable {
    
    //instance variable to store count
    private int counter = 0;
    //instance variable to store sheep "name"
    private String sheepName;

    //code constructor and methods
    public Sheep() {
        sheepName = "";
    }
    public void setSheep(String sheep) {
        this.sheepName = sheep;
    }
    public String getSheep() {
        return sheepName;
    }
    
    /*
    * Implement Cloneable interface method
    */
    
    //override clone method to suit this class
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    /*
    * Implement Countable interface methods
    */
    
    //override Countable interfact incrementCount to increment count   
    @Override
    public void incrementCount(){
        counter++;
    }
    
    /**
     * override Countable interface getCount method to
     * @return counter
     */
    @Override
    public int getCount(){
        return counter;
    }
    
    /**
     * override Countable interface getCountString method to
     * @return custom message
     */
    @Override
    public String getCountString(){
        return counter + " " + sheepName;
    }
    
    //customize Countable interface resetCount method to reset counter to 0;
    @Override
    public void resetCount() {
        counter = 0;
    }
    
    //method to return formatted count
    public String formatNumber(int count){
        int currCounter = count;
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(0);
        String formattedNumber = number.format(currCounter);
        return formattedNumber;
    }
}
