package model;

public class Enrollment {
    private int courseId;
    private int studentId;
    private int grade;

    public Enrollment(int courseId, int studentId, int grade) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

}
