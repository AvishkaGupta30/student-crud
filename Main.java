
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentManager manager = new StudentManager();
    int choice;

    do {
        System.out.println("\n--- Student Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                manager.addStudents(id, name, age);
                break;

            case 2:
                manager.viewAllStudents();
                break;

            case 3:
                System.out.print("Enter ID to update: ");
                int updateId = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter New Age: ");
                int newAge = scanner.nextInt();

                manager.updateStudents(updateId, newName, newAge);
                break;

            case 4:
                System.out.print("Enter ID to delete: ");
                int deleteId = scanner.nextInt();
                manager.deleteStudent(deleteId);
                break;

            case 5:
                System.out.println("Exiting the program...");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

    } while (choice != 5);

    scanner.close();
}  
}

