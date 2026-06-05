package practice_problem_03;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int [] arr = new int[n];
        int ans = (int)-1e9;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > ans) ans = arr[i];
        }
        System.out.println("The greatest number of the series is: " + ans);

    }
}
