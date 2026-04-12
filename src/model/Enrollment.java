package model;

public class Enrollment {
    private int courseId;
    private int studentId;
    private int enrollmentId;
    private String grade;

    public Enrollment(int courseId, int studentId, int enrollmentId, String grade) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.enrollmentId = enrollmentId;
        this.grade = grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public String getGrade() {
        return grade;
    }

}
