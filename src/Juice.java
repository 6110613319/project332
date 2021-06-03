
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Juice extends Beverage {

    private double cost;
    private String beverage;

    public Juice() {
        beverage = "Juice";
        cost = 35;
    }

    @Override
    public double getPrice() {
        return cost;
    }

    @Override
    public String getName() {
        return beverage;
    }

}
