import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input (String)

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input (int)

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner
    }
}
