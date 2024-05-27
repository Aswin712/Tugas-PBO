package com.main;
import Data.User;
import Data.Admin;
import Data.Student;


import java.util.Scanner;

public class LibrarySystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final String[] MAHASISWA_NIM = {"202310370311012"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Library System =====");

        System.out.print("1. Login as Student\n");
        System.out.print("2. Login as Admin\n");
        System.out.print("3. Exit\n");
        System.out.print("Choose (1-3) : ");

        String userType = scanner.nextLine();

        switch (userType) {
            case "1":
                mahasiswaLogin(scanner);
                break;
            case "2":
                adminLogin(scanner);
                break;
            case "3":
                ExitLogin();
                break;
            default:
                System.out.println("Option Not Found.");
                break;
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Successful Login as Admin.");
            Admin admin = new Admin(User.books);
            admin.menu();
        } else {
            System.out.println("User Not Found.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.print("Enter Your NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == 15) {
            boolean isValidNim = false;
            for (String validNim : MAHASISWA_NIM) {
                if (validNim.equals(nim)) {
                    isValidNim = true;
                    break;
                }
            }
            if (isValidNim) {
                System.out.println("Successful Login as Student.");
                Student student = new Student(User.books);
                student.menu();
            } else {
                System.out.println("User Not Found.");
            }
        } else {
            System.out.println("NIM must be 15 characters long.");
        }
    }

    private static void ExitLogin() {
        System.out.print("Goodbye!");
    }
}

