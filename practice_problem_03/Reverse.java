package practice_problem_03;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;
        while(i <= j){
            int tmp  =arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
        for(int a: arr){
            System.out.print(a + " ");
        }

    }
}
