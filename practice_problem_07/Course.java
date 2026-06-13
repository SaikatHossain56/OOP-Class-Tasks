package practice_problem_07;

public class Course {
    private int id;
    private String syllabus;
    private String title;
    private int credits;
    private String prerequisite;

    Course(int id, String syllabus, String title, int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
    int getId() {
        return id;
    }
}
