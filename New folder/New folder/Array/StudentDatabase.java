import java.util.Scanner;

public class StudentDatabase{
    private static final int MAX_STUDENTS = 50;
    private String[] studentNames;
    private int[] studentNumbers;
    private int currentSize;

    public StudentDatabase() {
        studentNames = new String[MAX_STUDENTS];
        studentNumbers = new int[MAX_STUDENTS];
        currentSize = 0;
    }

    public void insertStudent(int studentNumber, String studentName) {
        if (currentSize < MAX_STUDENTS) {
            studentNumbers[currentSize] = studentNumber;
            studentNames[currentSize] = studentName;
            currentSize++;
            System.out.println("Student inserted successfully.");
        } else {
            System.out.println("Student database is full. Cannot insert more students.");
        }
    }

    public void searchStudent(int studentNumber) {
        for (int i = 0; i < currentSize; i++) {
            if (studentNumbers[i] == studentNumber) {
                System.out.println("Student found: " + studentNames[i]);
                return;
            }
        }
        System.out.println("Student not found with number: " + studentNumber);
    }

    public void deleteStudent(int studentNumber) {
        for (int i = 0; i < currentSize; i++) {
            if (studentNumbers[i] == studentNumber) {
                System.out.println("Student deleted: " + studentNames[i]);
                // Move the last student information to the deleted position
                studentNumbers[i] = studentNumbers[currentSize - 1];
                studentNames[i] = studentNames[currentSize - 1];
                currentSize--;
                return;
            }
        }
        System.out.println("Student not found with number: " + studentNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase studentDatabase = new StudentDatabase();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Insert a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student number: ");
                    int studentNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    studentDatabase.insertStudent(studentNumber, studentName);
                    break;
                case 2:
                    System.out.print("Enter student number to search: ");
                    int searchNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    studentDatabase.searchStudent(searchNumber);
                    break;
                case 3:
                    System.out.print("Enter student number to delete: ");
                    int deleteNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    studentDatabase.deleteStudent(deleteNumber);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
