package practice_problem_01;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();

        double area = PI * r * r;
        System.out.println("Area: " + area);
    }
}
