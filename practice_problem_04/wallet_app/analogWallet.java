package practice_problem_04.wallet_app;

//Task 01:
public class analogWallet {

    static double deposit(double balance, double amount){
        return balance + amount;
    }

    static double withdraw(double balance, double amount){
        if (balance - amount < 0) {
            System.out.println("Insufficient balance");
            return balance;
        }
        return balance -amount;
    }

    public static void main(String[] args) {
        double balance_1 = 1000.0;
        double balance_2 = 2500.0;

        balance_1 = deposit(balance_1, 500);
        System.out.println("Balance 1: " + balance_1);
        balance_1 = withdraw(balance_1, 500);
        System.out.println("Balance 1: " + balance_1);

        balance_2 = withdraw(balance_2, 1000);
        System.out.println("Balance 2: " + balance_2);
        balance_2 = withdraw(balance_2, 2000);
        System.out.println("Balance 2: " + balance_2);
    }
}
