package practice_problem_04;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), tmp = "";


        for(int i = 0; i < s.length(); i++){
            tmp += s.charAt(s.length() - 1 - i);
        }

        if(s.equals(tmp))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
