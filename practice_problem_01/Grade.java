package practice_problem_01;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        String grade;

        if(num >= 0 && num <= 39) grade = "F";
        else if(num >= 40 && num <= 59) grade = "C+";
        else if(num >= 60 && num <= 69) grade = "B";
        else if(num >= 70 && num <= 79) grade = "A-";
        else if(num >= 80 && num <= 89) grade = "A";
        else grade = "A+";

        System.out.println("Your grade: " + grade);
    }
}
