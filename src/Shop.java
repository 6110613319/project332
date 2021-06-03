
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
public class Shop {
    private ArrayList<Order> order;
    private double price;
    
    public Shop() {
        order = new ArrayList<>();
        price = 0;
        
    }
    
    public ArrayList<Order> getOrder() {
        return order;
    }
    public void checkOrder() {
        for (int i = 0; i < order.size(); i++) {
            System.out.println("Product " + (i+1) + " : " + order.get(i).getName() + " Price " + order.get(i).getPrice() + " Baht.");
        }
    }
    public double getPrice() {
        return price;
    }
    public void addOrder(Order od) {
        order.add(od);
        price += od.getPrice();
        System.out.println("Add " + od.getName() + " Sucessfully.");
        System.out.println("Your price are " + price + " Baht.");
    }
    public void setPrice(double cost) {
        price = cost;
    }
}
