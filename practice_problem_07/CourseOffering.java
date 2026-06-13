package practice_problem_07;

public class CourseOffering {

    private int studentId;
    private int instructorId;
    private int courseId;
    private String time;
    private String sectionNo;
    private int roomId;
    private int year;
    private String semester;

    CourseOffering(int studentId, int instructorId, int courseId, String time, String sectionNo, int roomId, int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }
    void getInfo(){
        System.out.println(
                "Student ID: " + studentId +"\n" +
                "Instructor ID: " + instructorId + "\n" +
                "Course ID: " + courseId + "\n" +
                "Time: " + time + "\n" +
                "Section: " + sectionNo + "\n" +
                "Room: " + roomId + "\n" +
                "Year: " + year + "\n" +
                "Semester: " + semester + "\n"
        );
    }
}
