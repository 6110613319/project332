
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
public class FishBurger extends Burger {

    private String name;
    private double cost;
    private ArrayList<String> topping;

    public FishBurger() {
        name = "Fish Burger";
        cost = 50;
        topping = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return cost;
    }

    @Override
    public void setPrice(double c) {
        cost = cost + c;
    }

    @Override
    public ArrayList<String> getTopping() {
        return topping;
    }

    @Override
    public void addTopping(String top) {
        topping.add(top);
    }
}
