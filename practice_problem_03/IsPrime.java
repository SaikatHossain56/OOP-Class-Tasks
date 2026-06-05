package practice_problem_03;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        boolean flag = true;
        int a = sc.nextInt();
        if(a < 2) flag = false;
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");
    }
}
