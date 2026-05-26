import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        // for loop = execute some code a CERTAIN amount of times

        for (int i = 0; i < 10; i++) {
            System.out.println("maaitlunghau");
        }

        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        // EX01:
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to loops: ");
        int max = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        // EX02:
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
    }
}
