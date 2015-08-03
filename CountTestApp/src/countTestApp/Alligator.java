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
public class Alligator implements Countable{
 
    //instance to store count
    private int counter= 0;
    //instance variable to store alligator name
    private String alligatorName;
    
    //code constructor and methods
    public Alligator() {
        alligatorName = "";
    }
    public void setAlligator(String alligator){
        this.alligatorName = alligator;
    }
    public String getAlligator(){
        return alligatorName;
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
        return counter + " " + alligatorName;
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
