package practice_problem_03;

import java.util.Scanner;

public class OddNEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int [] arr = new int[n];
        int cntOdd = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 1) cntOdd++;
        }
        System.out.println("Total odd numbers: " + cntOdd);
        System.out.println("Total even numbers: " + (n - cntOdd));

    }

}
