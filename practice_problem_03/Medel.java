package practice_problem_03;

import java.util.Scanner;

public class Medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of semesters you have completed: ");
        int sem = sc.nextInt();
        System.out.println("Enter Your CGPA: ");
        double cg = sc.nextDouble();
        boolean flag = false;
        if(sem == 8) {
            if(cg >= 3.5) {
                flag = true;
            }
        }
        if(flag)
            System.out.println("Congratulations! you have achieved Letter Grade. Collect your medel from your department.");
        else
            System.out.println("You are not qualified for medel");
    }
}
