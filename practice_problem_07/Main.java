package practice_problem_07;

public class Main {
    public static void main(String[] args){

        Student s1 = new Student(238305, "Nafis Uddin", "SWE");
        Student s2 = new Student(238307, "Rafi Amin", "SWE");

        Instructor i1 = new Instructor(83002, "Ahsan Habib", "SWE", "Professor");
        Instructor i2 = new Instructor(83003, "Fazle Rabbi Rakib", "SWE", "Lecturer");

        Course c1 = new Course(
                61023,
                "Java syntax, Recursion, OOP concepts, OOP design",
                "OOP", 3, "Nothing");
        Course c2 = new Course(61024, "Graph, Tree, Trie, DP", "DSA", 3, "SPL");


        CourseOffering cr1 = new CourseOffering(
                s1.getId(), i1.getId(), c1.getId(),
                "10: 30", "1A", 203, 2026, "3rd"
                );
        CourseOffering cr2 = new CourseOffering(
                s1.getId(), i2.getId(), c2.getId(),
                "1.00", "1A", 830, 2026, "3rd"
        );

        CourseOffering cr3 = new CourseOffering(
                s2.getId(), i1.getId(), c1.getId(),
                "10.30", "1A", 830, 2026, "3rd"
        );
        CourseOffering cr4 = new CourseOffering(
                s2.getId(), i2.getId(), c2.getId(),
                "1.00", "1A", 830, 2026, "3rd"
        );


        cr1.getInfo();
        cr2.getInfo();
        cr3.getInfo();
        cr4.getInfo();


    }
}
