import java.util.Scanner;

class SystemLibrary {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String studentUsername = "student1";
        String studentPassword = "student1";
        String adminUsername = "admin";
        String adminPassword = "admin";

        while (true) {
            System.out.println("===== Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                loginAsStudent();
            } else if (choice == 2) {
                loginAsAdmin();
            } else if (choice == 3) {
                System.out.println("Thank you for using the Library System!");
                break;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }

        scanner.close();
    }

    public static void loginAsStudent() {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        String studentUsername = null;
        String studentPassword;
        System.out.println("User Not Found");
        System.out.println("=====");
    }

    private static void loginAsAdmin() {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        String adminUsername = new String();
        if (username.equals(adminUsername)) {
            String adminPassword = "";
            if (password.equals(adminPassword)) {
                System.out.println("Successful Login as Admin");
            } else {
                System.out.println("Admin User Not Found!!");
            }
        } else {
            System.out.println("Admin User Not Found!!");
        }
        System.out.println("=====");
    }
}