package practice_problem_04.wallet_app;

class UpdatedWallet{

    private String lastWithdrawMode;
    private double balance;

    UpdatedWallet(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("Insufficient Balance.");
            return;
        }
        balance -= amount;
        if(lastWithdrawMode != null){
            System.out.println("Last Withdraw Mode: " + lastWithdrawMode);
        }
        lastWithdrawMode = "Normal Withdrawal";

    }
    public void withdraw(double amount, String Mode){
        if(balance - amount < 0){
            System.out.println("Insufficient Balance.");
            return;
        }
        balance -= amount;
        if(this.lastWithdrawMode != null){
            System.out.println("Last Withdraw Mode: " + lastWithdrawMode);
        }
        lastWithdrawMode = Mode;
    }

}
public class Task4 {
    public static void main(String[] args){

        UpdatedWallet student = new UpdatedWallet(3000.00);

        student.withdraw(500);
        student.withdraw(500, "Bkash");
        student.withdraw(1500, "GPAY");
        student.withdraw(200);
        student.withdraw(100, "ATM");
        student.withdraw(1000);
    }
}
