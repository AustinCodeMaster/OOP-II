import java.util.Scanner;

class InputExample {
    Scanner scanner = new Scanner(System.in); // create scanner and connect to console

    public void readNameAndAge() {
        String name;
        int age; // in years

        System.out.print("Name? ");
        name = scanner.next(); // read next word from input

        System.out.print("Age? ");
        age = scanner.nextInt(); // read an int from input

        System.out.println("Hello " + name + ", you are " + age + " springs young.");
    }

    public static void main(String[] args) {
        (new InputExample()).readNameAndAge();
    }
}

