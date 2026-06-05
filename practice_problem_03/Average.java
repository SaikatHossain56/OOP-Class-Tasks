package practice_problem_03;

public class Average {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 2, 7};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        System.out.println("Average: " + avg);
    }
}
