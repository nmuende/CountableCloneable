/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countTestApp;
/**
 *
 * @author MuendeProfessional
 */
public interface Countable {
    /**
     * used to count an object
     * @return name of object
     */
    public abstract void incrementCount();
    public abstract int getCount();
    public abstract String getCountString();
    public abstract void resetCount();
}
