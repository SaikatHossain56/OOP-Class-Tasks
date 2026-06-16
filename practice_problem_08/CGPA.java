package practice_problem_08;
class CalculateCGPA{
    private double cg;
    private final double[][] arr = new double[5][2];

    CalculateCGPA(
            String sub1, double grade1, double credits1,
            String sub2, double grade2, double credits2,
            String sub3, double grade3, double credits3,
            String sub4, double grade4, double credits4,
            String sub5, double grade5, double credits5
    ){
        arr[0][0] = grade1; arr[0][1] = credits1;
        arr[1][0] = grade2; arr[1][1] = credits2;
        arr[2][0] = grade3; arr[2][1] = credits3;
        arr[3][0] = grade4; arr[3][1] = credits4;
        arr[4][0] = grade5; arr[4][1] = credits5;
    }
    private void calculate(){
        double totalCredits = 0;
        double weight = 0;
        for(int i = 0; i < 5; i++){
            totalCredits += arr[i][1];
            weight += (arr[i][0] * arr[i][1]);
        }

        cg = weight / totalCredits;
    }

    double getCGPA(){
        calculate();
        return cg;
    }
}
public class CGPA {
    public static void main(String[] args){

        CalculateCGPA s1 = new CalculateCGPA(
                "OOP", 3.75, 3,
                "OOP LAB", 4, 2,
                "Statistics", 3.5, 3,
                "Business", 4, 3,
                "SRE", 4, 2
        );

        String result = String.format("%.2f", s1.getCGPA());
        System.out.println("Student 01's CGPA: " + result);

        CalculateCGPA s2 = new CalculateCGPA(
                "OOP", 3.00, 3,
                "OOP LAB", 3.75, 2,
                "Statistics", 4, 3,
                "Business", 2.75, 3,
                "SRE", 3.5, 2
        );
        result = String.format("%.2f", s2.getCGPA());
        System.out.println("Student 02's CGPA: " + result);

        CalculateCGPA s3 = new CalculateCGPA(
                "OOP", 3.25, 3,
                "OOP LAB", 3.5, 2,
                "Statistics", 4, 3,
                "Business", 4, 3,
                "SRE", 4, 2
        );
        result = String.format("%.2f", s3.getCGPA());
        System.out.println("Student 03's CGPA: " + result);

        CalculateCGPA s4 = new CalculateCGPA(
                "OOP", 3.50, 3,
                "OOP LAB", 3.75, 2,
                "Statistics", 3.25, 3,
                "Business", 2.75, 3,
                "SRE", 4, 2
        );
        result = String.format("%.2f", s4.getCGPA());
        System.out.println("Student 04's CGPA: " + result);

        CalculateCGPA s5 = new CalculateCGPA(
                "OOP", 4, 3,
                "OOP LAB", 3.75, 2,
                "Statistics", 3.5, 3,
                "Business", 3.75, 3,
                "SRE", 3.5, 2
        );
        result = String.format("%.2f", s5.getCGPA());
        System.out.println("Student 05's CGPA: " + result);

    }
}
