import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // declare
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine();

        System.out.print("What is your GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a student? (true / false): ");
        boolean isStudent = sc.nextBoolean();

        // output
        System.out.println("\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + gpa);

        if (isStudent)
            System.out.println("You are a student!");
        else
            System.out.println("You are NOT a student!");

        System.out.println("Your favorite color is: " + color);

        // close Scanner
        sc.close();
        // nếu như ko close Scanner thì sẽ:
        // + gây rò rỉ tài nguyên (Resource Leak)
        // + gây lãng phí bộ nhớ
        // + chỉ close() ở cuối hàm main khi chắc chắn ko cần cần user input nữa
    }
}
