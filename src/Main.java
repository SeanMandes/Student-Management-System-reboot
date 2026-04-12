import dao.CourseDAO;
import dao.EnrollmentDAO;
import dao.StudentDAO;
import model.Course;
import model.Enrollment;
import model.Student;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO sdao = new StudentDAO();
        // sdao.addStudent(new Student("John", "john@gmail.com", 21));

        /*
         * List<Student> students = sdao.getAllStudents();
         * for (Student student : students) {
         * System.out.println(student.getName());
         * }
         */

        // sdao.deleteStudent(10);

        // sdao.updateStudent(1, "CharlieBruh", "charliebruh@gmail.com", 20);

        CourseDAO cdao = new CourseDAO();
        // cdao.addCourse(new Course("Math", "Dr. Joe"));
        /*
         * List<Course> courses = cdao.getAllCourses();
         * for (Course course : courses) {
         * System.out.println(course.getCourseName());
         * }
         */

        // cdao.deleteCourse(3);

        // cdao.updateCourse(4, "Psychology", "Prof. Jotaro");

        EnrollmentDAO edao = new EnrollmentDAO();
        Student student = new Student(2, "David", "david@gmail.com", 23);
        Course course = new Course(2, "Chemistry", "Dr. White");
        edao.enrollStudent(student, course);

    }
}
