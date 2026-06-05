package practice_problem_03;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int size = 12;
        for(int i = 3; i <= size; i++) {
             int nxt = a + b;
             System.out.print(nxt + " ");
             a =b;
             b = nxt;
        }
    }
}
