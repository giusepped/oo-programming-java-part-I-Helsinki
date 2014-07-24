 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giuseppedesantis
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int numbAtStart){
        this.number = numbAtStart;
    }
    
    public int multiply(int otherNumber){
        int multiplied = otherNumber * this.number;
        return multiplied;
    }
}
