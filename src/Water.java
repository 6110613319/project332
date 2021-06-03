
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Water extends Beverage {
    private double cost;
    private String beverage;
    
    public Water() {
        beverage = "water";
        cost = 15;
    }

    @Override
    public String getName() {
        return beverage;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
