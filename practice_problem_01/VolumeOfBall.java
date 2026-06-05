package practice_problem_01;

import java.util.Scanner;

import static java.lang.Math.PI;

public class VolumeOfBall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();

        double area = (4.0 / 3.0) * PI * r * r * r;
        System.out.println("Volume: " + area);
    }
}
