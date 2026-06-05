package practice_problem_01;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(((num % 2) == 0) ? (num + " is an even number") : (num + " is an odd number"));
    }
}
