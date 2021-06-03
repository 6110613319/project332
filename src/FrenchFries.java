/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class FrenchFries extends Snack {
    private String snack;
    private double cost;
    
    public FrenchFries() {
        snack = "French Fries";
        cost = 40;
    }
    @Override
    public String getName() {
        return snack;
    }

    @Override
    public double getPrice() {
        return cost;
    }
    
}
