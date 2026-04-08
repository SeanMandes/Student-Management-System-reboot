import dao.StudentDAO;
import model.Student;

public class Main {

    public static void main(String[] args) {
        StudentDAO sdao = new StudentDAO();
        // sdao.addStudent(new Student("John", "john@gmail.com", 21));

        List<Student> students = sdao.getAllStudents();
        for (student : students){
            System.out.prinlnt()
        }

        //sdao.deleteStudent(10);

        // sdao.updateStudent(1, "CharlieBruh", "charliebruh@gmail.com", 20);

    }
}
