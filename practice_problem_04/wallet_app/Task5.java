package practice_problem_04.wallet_app;

import static practice_problem_04.wallet_app.WalletBonus.swap;

class WalletBonus{
    private double balance;

    WalletBonus (double balance){
        this.balance = balance;
    }

    public void addBonus(WalletBonus wallet, double amount ){
        wallet.setBalance(amount);
    }

    public static void swap(WalletBonus a, WalletBonus b){
        WalletBonus tmp = a;
        a = b;
        b = tmp;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
         balance += amount;
    }

}
public class Task5 {
    public static void main(String[] args) {
        WalletBonus w1 = new WalletBonus(1500);
        w1.addBonus(w1,5000);
        System.out.println("Total Amount:  " + w1.getBalance());

        WalletBonus w2 = new WalletBonus(1000);
        swap(w1, w2);

        System.out.println("Amount of wallet 01: " + w1.getBalance());
        System.out.println("Amount of wallet 02: " + w2.getBalance());
        System.out.println("" +
                "We can swap 2 objects using method. Java only supports pass by values." +
                "\nSo when we pass w1 and w2, a and b copy their references, and they get swapped." +
                "\nBut the original w1 and w2 remain same." +
                "");
    }
}
