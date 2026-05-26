import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // while loop = repeat some code forever
        // while some condition remains true

        Scanner sc = new Scanner(System.in);

        // EX01: while
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name);

        // EX02: while
        String response = "";
        while (!response.equalsIgnoreCase("Q")) {
            System.out.print("Press Q to quit: ");
            response = sc.nextLine();
        }
        System.out.println("You have quit the game!");

        // EX03: do while
        int age = 0;
        do {
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            sc.nextLine();
        } while (age < 0);
        System.out.println("You are " + age + " years old");

        sc.close();
    }
}
