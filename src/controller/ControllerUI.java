package controller;

import java.util.Scanner;

import model.User;
import security.AuthService;

public class ControllerUI {

    static final Scanner scanner = new Scanner(System.in);
    static final AuthService authService = new AuthService();

    public static void run() {

        String email;
        System.out.print("Email: ");
        email = scanner.nextLine();

        String password;
        System.out.print("Password: ");
        password = scanner.nextLine();

        scanner.next();

        User user = authService.login(email, password);

        if (authService.isAdmin(user)) {
            System.out.println("Add Course");
            System.out.println("Remove Course");
            System.out.println("Add Instructor");
            System.out.println("Assign Instructor");
            System.out.println("Manage Students");
            System.out.println("Assign Grade");
        }

        if (authService.isStudent(user)) {
            System.out.println("View Courses");
            System.out.println("VIew Instructors");
            System.out.println("Enroll In Course");
            System.out.println("View Grades");
        }

    }
}
