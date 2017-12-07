/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

/**
 *
 * @author lenovo
 */
public class BankAccount implements Bank {
    
    private float balance;
private String OwnerName;

    @Override
    public void deposit(float amount) {float depo = balance + amount;}

    @Override
    public void withdraw(float amount) {float withdraw = balance - amount;}

@Override public float getBalance() {return balance;}

}


