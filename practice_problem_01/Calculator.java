package practice_problem_01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select operator: ");
        char op = sc.next().charAt(0);

        double ans = 0;

        switch (op){
            case '+':{
                ans = a + b;
                break;
            }
            case '-':{
                ans = a - b;
                break;
            }
            case '*':{
                ans = (long) a * b;
                break;
            }
            case '/':{
                ans = (1.0 * a) / b;
                break;
            }
        }

        System.out.println("Result: " + ans);
    }
}
