package practice_problem_01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        double length = sc.nextDouble();
        System.out.println("Enter Height: ");
        double height = sc.nextDouble();
        double area = 0.5 * length * height;
        System.out.println("Area: " + area);
    }
}
