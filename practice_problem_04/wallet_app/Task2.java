package practice_problem_04.wallet_app;
class Wallet{
    private double balance;
    Wallet(Double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Message: "+ amount +" deposited.");
    }
    public void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("Not Enough Balance.");
            return;
        }
        balance -= amount;
        System.out.println("Message: "+ amount +" withdrawn.");
    }

    public void getBalance() {
        System.out.println("Account Balance: "+ balance);
    }
}

public class Task2 {
    public static void main(String[] args) {

        Wallet student1 = new Wallet(1000.0);
        Wallet student2 = new Wallet(2500.0);

        // Student 01:
        student1.getBalance();
        student1.deposit(500);
        student1.getBalance();
        student1.withdraw(100);
        student1.getBalance();
        student1.withdraw(1500);
        student1.getBalance();

        System.out.println();

        //Student02:
        student2.getBalance();
        student2.deposit(500);
        student2.getBalance();
        student2.withdraw(100);
        student2.getBalance();
        student2.withdraw(1500);
        student2.getBalance();


    }

}
