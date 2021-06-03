/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class Snack implements Order {
    
    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();
}
