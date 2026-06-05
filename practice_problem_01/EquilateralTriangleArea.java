package practice_problem_01;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of arm: ");
    double length = sc.nextDouble();

    double area = (Math.sqrt(3) / 4) * length * length;
    System.out.println("Area: "+area);
}
}
