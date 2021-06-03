
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
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOpen = true;
        Pay p;
        int pay_choice;
        System.out.println("Welcome to OOAD Burger.");
        while (isOpen) {
            Shop shop = new Shop();
            System.out.print("Choose your set\n[1] Promotion Set\n[2] Custom Set\n: ");
            int p_choice = sc.nextInt();
            switch (p_choice) {
                case 1:
                    System.out.print("Choose promotion\n[1] Promotion 1\n[2] Promotion 2\n[3] Promotion 3\n[4] Promotion 4\n[5] Back\n: ");
                    int promote_choice = sc.nextInt();
                    switch (promote_choice) {
                        case 1:
                            shop = new Promotion().Promotion1();
                            shop.checkOrder();
                            break;
                        case 2:
                            shop = new Promotion().Promotion2();
                            shop.checkOrder();
                            break;
                        case 3:
                            shop = new Promotion().Promotion3();
                            shop.checkOrder();
                            break;
                        case 4:
                            shop = new Promotion().Promotion4();
                            shop.checkOrder();
                            break;
                    }
                    System.out.println("Your Order's price is " + shop.getPrice() + " Baht.");
                    System.out.print("Choose your method to pay\n[1] Cash\n[2] Prompt Pay\n[3] Debit Card\n: ");
                    pay_choice = sc.nextInt();
                    switch (pay_choice) {
                        case 1:
                            p = new Cash(shop.getPrice());
                            p.spend();
                            if (p.getConfirm()) {

                                isOpen = false;
                            }
                            break;
                        case 2:
                            p = new PromptPay(shop.getPrice());
                            p.spend();
                            if (p.getConfirm()) {

                                isOpen = false;
                            }
                            break;
                        case 3:
                            p = new DebitPay(shop.getPrice());
                            p.spend();
                            if (p.getConfirm()) {

                                isOpen = false;
                            }
                            break;
                    }

                    break;

                case 2:
                    boolean isPay = true;
                    while (isPay) {
                        System.out.print("Choose Order\n[1] Burger\n[2] Beverage\n[3] Snack\n[4] Check Order\n[5] Pay\n: ");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1: {
                                Burger bg = null;
                                System.out.print("Choose Your Burger\n[1] Beef Burger\n[2] Pork Burger\n[3] Chicken Burger\n[4] Fish Burger\n[5] Back\n: ");
                                int b_choice = sc.nextInt();
                                switch (b_choice) {
                                    case 1:
                                        bg = new BeefBurger();
                                        break;
                                    case 2:
                                        bg = new PorkBurger();
                                        break;
                                    case 3:
                                        bg = new ChickBurger();
                                        break;
                                    case 4:
                                        bg = new FishBurger();
                                        break;
                                }

                                while (true) {
                                    System.out.println("Add topping\n[1] Bacon\n[2] Cheese\n[3] Cucumber\n[4] Egg\n[5] Onion");
                                    System.out.print("[6] Romaine\n[7] Tomato\n[8] Sauce\n[9] Done\n: ");
                                    int t_choice = sc.nextInt();
                                    switch (t_choice) {
                                        case 1:
                                            bg = new Bacon(bg);
                                            break;
                                        case 2:
                                            bg = new Cheese(bg);
                                            break;
                                        case 3:
                                            bg = new Cucumber(bg);
                                            break;
                                        case 4:
                                            bg = new Egg(bg);
                                            break;
                                        case 5:
                                            bg = new Onion(bg);
                                            break;
                                        case 6:
                                            bg = new Romaine(bg);
                                            break;
                                        case 7:
                                            bg = new Tomato(bg);
                                            break;
                                        case 8:
                                            System.out.print("Add topping\n[1] BBQ Sauce\n[2] Black pepper Sauce\n[3] Spicy Sauce\n[4] Wasabi Sauce\n[5] Back\n: ");
                                            int s_choice = sc.nextInt();
                                            switch (s_choice) {
                                                case 1:
                                                    bg = new BBQSauce(bg);
                                                    break;
                                                case 2:
                                                    bg = new BlackPepperSauce(bg);
                                                    break;
                                                case 3:
                                                    bg = new SpicySauce(bg);
                                                    break;
                                                case 4:
                                                    bg = new WasabiSauce(bg);
                                                    break;
                                            }

                                    }
                                    if (t_choice == 9) {
                                        break;
                                    }

                                }
                                shop.addOrder(bg);
                                break;
                            }
                            case 2:
                                System.out.print("Choose Your Beverage\n[1] Water\n[2] Juice\n[3] Soft Drink\n[4] Coffee\n[5] Back\n: ");
                                int b_choice = sc.nextInt();
                                switch (b_choice) {
                                    case 1:
                                        shop.addOrder(new Water());
                                        break;
                                    case 2:
                                        shop.addOrder(new Juice());
                                        break;
                                    case 3:
                                        shop.addOrder(new SoftDrink());
                                        break;
                                    case 4:
                                        shop.addOrder(new Coffee());
                                        break;
                                }
                                break;
                            case 3:
                                System.out.print("Choose Your Snack\n[1] French Fries\n[2] Mashed Potato\n[3] Back\n: ");
                                int s_choice = sc.nextInt();
                                switch (s_choice) {
                                    case 1:
                                        shop.addOrder(new FrenchFries());
                                        break;
                                    case 2:
                                        shop.addOrder(new MashPotato());
                                        break;
                                }
                                break;
                            case 4:
                                shop.checkOrder();
                                break;
                            case 5:
                                System.out.println("Your Order's price is " + shop.getPrice() + " Baht.");
                                System.out.print("Choose your method to pay\n[1] Cash\n[2] Prompt Pay\n[3] Debit Card\n: ");
                                pay_choice = sc.nextInt();
                                switch (pay_choice) {
                                    case 1:
                                        p = new Cash(shop.getPrice());
                                        p.spend();
                                        if (p.getConfirm()) {
                                            isPay = false;
                                            isOpen = false;
                                        }
                                        break;
                                    case 2:
                                        p = new PromptPay(shop.getPrice());
                                        p.spend();
                                        if (p.getConfirm()) {
                                            isPay = false;
                                            isOpen = false;
                                        }
                                        break;
                                    case 3:
                                        p = new DebitPay(shop.getPrice());
                                        p.spend();
                                        if (p.getConfirm()) {
                                            isPay = false;
                                            isOpen = false;
                                        }
                                        break;
                                }

                                break;

                        }

                    }
            }

        }
    }
}
