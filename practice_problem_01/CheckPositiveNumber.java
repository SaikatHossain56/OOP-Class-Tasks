package practice_problem_01;

import java.util.Scanner;

public class CheckPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println((num > 0) ? (num + " is a positive number") : (num + " is not a positive number"));
    }
}
