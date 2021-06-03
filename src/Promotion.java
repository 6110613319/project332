
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Promotion {
    
    public Shop Promotion1() {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.print("Choose Burger\n[1] Chicken Burger\n[2] Fish Burger\n: ");
        int b_choice = sc.nextInt();
        switch (b_choice) {
            case 1:
                shop.addOrder(new BurgerBuilder().defaultChickBurger());
                break;
            case 2:
                shop.addOrder(new BurgerBuilder().defaultFishBurger());
                break;
        }
        System.out.println("Choose set\n[1] French Fries + Soft Drink\n[2] Water + Mash Potato\n: ");
        int s_choice = sc.nextInt();
        switch (s_choice) {
            case 1:
                shop.addOrder(new FrenchFries());
                shop.addOrder(new SoftDrink());
                break;
            case 2:
                shop.addOrder(new Water());
                shop.addOrder(new MashPotato());
                break;
        }
        shop.setPrice(115);
        return shop;
    }
    public Shop Promotion2() {
        Shop shop = new Shop();
        shop.addOrder(new BurgerBuilder().defaultPorkBurger());
        shop.addOrder(new FrenchFries());
        shop.addOrder(new SoftDrink());
        shop.setPrice(120);
        return shop;
    }
    public Shop Promotion3() {
        Shop shop = new Shop();
        shop.addOrder(new BurgerBuilder().defaultBeefBurger());
        shop.addOrder(new FrenchFries());
        shop.addOrder(new SoftDrink());
        shop.setPrice(130);
        return shop;
    }
    public Shop Promotion4() {
        Shop shop = new Shop();
        shop.addOrder(new BurgerBuilder().defaultBeefBurger());
        shop.addOrder(new BurgerBuilder().defaultPorkBurger());
        shop.addOrder(new MashPotato());
        shop.addOrder(new SoftDrink());
        shop.addOrder(new Juice());
        shop.setPrice(240);
        return shop;
    }
}
