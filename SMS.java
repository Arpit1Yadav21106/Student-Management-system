import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store student data
        int[] roll = new int[100];
        String[] name = new String[100];
        int[] age = new int[100];

        int count = 0;   // number of students
        int choice;

        while (true) {
            // Menu
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Input validation
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number only!");
                sc.next(); // clear wrong input
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                // ADD STUDENT
                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Age: ");
                    age[count] = sc.nextInt();

                    count++;
                    System.out.println("Student added successfully!");
                    break;

                // VIEW STUDENTS
                case 2:
                    if (count == 0) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll: " + roll[i]
                                    + ", Name: " + name[i]
                                    + ", Age: " + age[i]);
                        }
                    }
                    break;

                // EXIT
                case 3:
                    System.out.println("Thank you! Program exited.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Choose 1, 2, or 3.");
            }
        }
    }
}
