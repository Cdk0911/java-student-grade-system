import java.util.Scanner;

class Student {
    // Attributes
    String name;
    int rollNumber;
    int marks[] = new int[5];
    int total = 0;
    double average;
    char grade;

    // Method to input student details
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
    }

    // Method to calculate average and grade
    void calculateGrade() {
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    // Method to display student details
    void displayDetails() {
        System.out.printf("%-10s %-10d %-10.2f %-5c\n", name, rollNumber, average, grade);
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE MANAGEMENT SYSTEM =====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].inputDetails();
            students[i].calculateGrade();
        }

        // Display details
        System.out.println("\n===========================================");
        System.out.println("Name       RollNo     Average    Grade");
        System.out.println("===========================================");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

        System.out.println("===========================================");
        System.out.println("Program completed successfully!");
    }
}
