package model;

public class Course {
    private String course_name;
    private String instructor;
    private int id;

    public Course(String course_name, String instructor) {
        this.course_name = course_name;
        this.instructor = instructor;
    }

    public Course(int id, String course_name, String instructor) {
        this.id = id;
        this.course_name = course_name;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return course_name;
    }

    public String getInstructor() {
        return instructor;
    }
}
