package practice_problem_04;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      StringBuilder ans = new StringBuilder();


      for(int i = 0; i < s.length(); i++){
            ans.append(s.charAt(s.length() - 1 - i));
      }
      System.out.println("Reversed: " + ans);
  }
}
