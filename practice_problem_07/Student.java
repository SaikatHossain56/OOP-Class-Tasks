package practice_problem_07;

public class Student {
    private int id;
    private String name;
    private String program;

    Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }
    int getId() {
        return id;
    }
}
