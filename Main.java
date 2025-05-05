import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0 - 100): ");
        int marks = scanner.nextInt();

        Student student = new Student(marks);
        System.out.println("Grade: " + student.getGrade());

        scanner.close();
    }
}