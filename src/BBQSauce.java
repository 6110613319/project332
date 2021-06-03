
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class BBQSauce extends Sauce {

    private String topping;
    private Burger burgers;

    public BBQSauce(Burger burger) {
        topping = "BBQ Sauce";
        burgers = burger;
        select();
    }

    @Override
    public void select() {
        burgers.addTopping(topping);

    }

    @Override
    public String getName() {
        return burgers.getName();
    }

    @Override
    public ArrayList<String> getTopping() {
        return burgers.getTopping();
    }

    @Override
    public void addTopping(String top) {
        burgers.addTopping(top);
    }

    @Override
    public double getPrice() {
        return burgers.getPrice();
    }

    @Override
    public void setPrice(double c) {
        burgers.setPrice(c);
    }

}