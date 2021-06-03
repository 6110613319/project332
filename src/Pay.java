/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class Pay {
    private boolean confirm;
    abstract boolean confirm();

    abstract void pay();

    public final void spend() {
        
        confirm = confirm();
        if (confirm) {
            pay();
        }
    }
    public boolean getConfirm() {
        return confirm;
    }
}
