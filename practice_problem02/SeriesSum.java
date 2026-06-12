package practice_problem02;

public class SeriesSum {

    public static void main(String[] args) {

        long sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            sum += i;
        }
        System.out.print("Sum of Even Series: " + sum);

        sum = 0;
        for (int i = 1; i <= 19; i += 2) {
            sum += i;
        }
        System.out.print("\nSum of Odd Series: " + sum);

    }
}