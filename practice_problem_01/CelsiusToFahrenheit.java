package practice_problem_01;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius: ");
        double c = sc.nextDouble();

        double f =( 9.0 / 5.0) * c + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
