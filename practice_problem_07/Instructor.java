package practice_problem_07;

public class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

   Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
    int getId() {
        return id;
    }
}
