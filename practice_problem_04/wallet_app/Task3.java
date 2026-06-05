package practice_problem_04.wallet_app;
class InitialWallet{
    private static long counter = 2023831001;
    private long uniqueID;
    private double balance;
    InitialWallet(){
        uniqueID = counter ++;
        balance = 0;
    }
    InitialWallet(double balance){
        uniqueID = counter++;
        this.balance = balance;
    }
    public void getUniqueID(){
        System.out.println("Unique ID: " + uniqueID);
    }
    public void getBalance(){
        System.out.println("Initial Balance: " + balance);
    }

}
public class Task3 {
    public static void main(String[] args) {

        //Student 01:
        InitialWallet student1 = new InitialWallet();
        student1.getUniqueID();
        student1.getBalance();

        System.out.println();

        //Student 02:

        InitialWallet student2 = new InitialWallet(1500.00);

        student2.getUniqueID();
        student2.getBalance();


    }

}
