/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MashPotato extends Snack {

    private String snack;
    private double cost;

    public MashPotato() {
        snack = "Mash Potato";
        cost = 60;
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
