
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
public class PromptPay extends Pay {
    private String pay;
    private double cost;

    public PromptPay(double cost) {
        pay = "Prompt Pay";
        this.cost = cost;
    }

    @Override
    boolean confirm() {
        System.out.print("Confirm pay with " + pay + "? (y/n) : ");
        Scanner sc = new Scanner(System.in);
        String con = sc.nextLine();
        if ("y".equals(con)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void pay() {
        System.out.println("Pay " + cost + " Baht with " + pay + " Successfully.");
        System.out.println("Thank you for use my service.");
    }
}
