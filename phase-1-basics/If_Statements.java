import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        // if statements = performs a block of code if its condition is true

        Scanner sc = new Scanner(System.in);

        String name = "";
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Are you a student? (true or false): ");
        isStudent = sc.nextBoolean();

        // group 1: name
        if (name.isBlank())
            System.out.println("You didn't enter your name!");
        else
            System.out.println("Hello " + name);

        // group 2: age
        if (age >= 100) {
            System.out.println("You are too old to be alive!");
        } else if (age >= 65) {
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age > 0) {
            System.out.println("You are a child");
        } else {
            System.out.println("You haven't been born yet!");
        }

        // group 3: isStudent
        if (isStudent)
            System.out.println("You are a student!");
        else
            System.out.println("You are NOT a student!");

        sc.close();
    }
}
