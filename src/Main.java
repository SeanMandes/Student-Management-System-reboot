import dao.CourseDAO;
import dao.EnrollmentDAO;
import dao.StudentDAO;
import model.Course;
import model.Enrollment;
import model.Student;
import service.ReportService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * StudentDAO sdao = new StudentDAO();
         * sdao.addStudent(new Student("John", "john@gmail.com", 21));
         * 
         * List<Student> students = sdao.getAllStudents();
         * for (Student student : students) {
         * System.out.println(student.getName());
         * }
         */
        // sdao.deleteStudent(9);

        // sdao.updateStudent(1, "CharlieBruh", "charliebruh@gmail.com", 20);

        // CourseDAO cdao = new CourseDAO();
        // cdao.addCourse(new Course(1, "Bio Chemistry"));
        /*
         * List<Course> courses = cdao.getAllCourses();
         * for (Course course : courses) {
         * System.out.println(course.getCourseName());
         * }
         */

        // cdao.deleteCourse(1);
        // cdao.updateCourse(4, "Art");

        EnrollmentDAO edao = new EnrollmentDAO();

        /*
         * StudentDAO student = new StudentDAO();
         * CourseDAO course = new CourseDAO();
         * EnrollmentDAO edao = new EnrollmentDAO();
         * 
         * // -------- Test Case 1 --------
         * int s1 = student.getStudentID("charlie@gmail.com"); // 1
         * int c1 = course.getCourseID("History"); // 4
         * edao.enrollStudent(s1, c1);
         * edao.assignGrade("D-", s1, c1);
         * 
         * // -------- Test Case 2 --------
         * int s2 = student.getStudentID("emma@gmail.com"); // 3
         * int c2 = course.getCourseID("Physics"); // 1
         * edao.enrollStudent(s2, c2);
         * edao.assignGrade("A", s2, c2);
         * 
         * // -------- Test Case 3 --------
         * int s3 = student.getStudentID("ian@gmail.com"); // 7
         * int c3 = course.getCourseID("Database Systems"); // 7
         * edao.enrollStudent(s3, c3);
         * edao.assignGrade("B+", s3, c3);
         * 
         * // -------- Test Case 4 --------
         * int s4 = student.getStudentID("hannah@gmail.com"); // 6
         * int c4 = course.getCourseID("English"); // 5
         * edao.enrollStudent(s4, c4);
         * edao.assignGrade("A-", s4, c4);
         * 
         * // -------- Test Case 5 --------
         * int s5 = student.getStudentID("david@gmail.com"); // 2
         * int c5 = course.getCourseID("Chemistry"); // 2
         * edao.enrollStudent(s5, c5);
         * edao.assignGrade("C", s5, c5);
         * 
         * // edao.removeEnrollment(student_id, course_id);
         */

        /*
         * StudentDAO student = new StudentDAO();
         * CourseDAO course = new CourseDAO();
         * EnrollmentDAO edao = new EnrollmentDAO();
         * 
         * // -------- Test Case 6 --------
         * int s6 = student.getStudentID("fiona@gmail.com");
         * int c6 = course.getCourseID("Biology");
         * edao.enrollStudent(s6, c6);
         * edao.assignGrade("B", s6, c6);
         */

        // Example Remove Enrollment
        // edao.removeEnrollment(s15, c15);

        /*
         * CourseDAO course = new CourseDAO();
         * ReportService rp = new ReportService();
         * 
         * // rp.fullReport();
         * // rp.numberOfStudentForEachCourse();
         * 
         * StudentDAO sdao = new StudentDAO();
         * Scanner sc = new Scanner(System.in);
         * String input;
         * do {
         * System.out.println("1. Add Student\n" + //
         * "2. View Students\n" + //
         * "3. Add Course\n" + //
         * "4. Enroll Student\n" + //
         * "5. View Reports\n" + //
         * "6. Exit");
         * 
         * input = sc.nextLine();
         * switch (input) {
         * case "1":
         * System.out.print("Name: ");
         * String name = sc.nextLine().toLowerCase();
         * 
         * System.out.print("Email: ");
         * String email = sc.nextLine();
         * 
         * System.out.print("Age: ");
         * int age = sc.nextInt();
         * sc.nextLine();
         * 
         * sdao.addStudent(new Student(name, email, age));
         * 
         * break;
         * 
         * case "2":
         * List<Student> students = sdao.getAllStudents();
         * for (Student student : students) {
         * System.out.println(student.getName());
         * }
         * break;
         * 
         * case "3":
         * String hi = "hi";
         * break;
         * case "6":
         * System.out.println("Exit the program!");
         * break;
         * default:
         * System.out.println("Invalid input");
         * break;
         * }
         * } while (!input.equals("6"));
         * sc.close();
         */

    }

}
