package model;

public class Enrollment {
    private int courseId;
    private int studentId;
    private int enrollmentId;

    public Enrollment(int courseId, int studentId, int enrollmentId) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.enrollmentId = enrollmentId;
    }

    public Enrollment(int courseId, int studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
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

}
