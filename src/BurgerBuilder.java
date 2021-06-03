/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class BurgerBuilder {
    
    public Burger defaultFishBurger() {
        Burger bg = new FishBurger();
        bg = new Cheese(bg);
        bg = new Romaine(bg);
        bg = new WasabiSauce(bg);
        return bg;
    }
    public Burger defaultChickBurger() {
        Burger bg = new ChickBurger();
        bg = new Cheese(bg);
        bg = new Romaine(bg);
        bg = new BBQSauce(bg);
        return bg;
    }
    public Burger defaultBeefBurger() {
        Burger bg = new FishBurger();
        bg = new Cheese(bg);
        bg = new Romaine(bg);
        bg = new BlackPepperSauce(bg);
        return bg;
    }
    public Burger defaultPorkBurger() {
        Burger bg = new FishBurger();
        bg = new Cheese(bg);
        bg = new Romaine(bg);
        bg = new BBQSauce(bg);
        return bg;
    }
}
