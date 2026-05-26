import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        // INTEGER
        int num1, num2, num3, num4;

        num1 = random.nextInt(1, 6); // 1 - 5
        num2 = random.nextInt(6, 11); // 5 - 10
        num3 = random.nextInt(11, 16); // 10 - 15
        num4 = random.nextInt(3); // 0 - 3

        System.out.println("number 1: " + num1);
        System.out.println("number 2: " + num2);
        System.out.println("number 3: " + num3);
        System.out.println("number 4: " + num4);

        // DOUBLE
        double num5, num6, num7;

        num5 = random.nextDouble();
        num6 = random.nextDouble(5);
        num7 = random.nextDouble(1, 10);

        System.out.println("number 5: " + num5);
        System.out.println("number 6: " + num6);
        System.out.println("number 7: " + num7);

        // BOOLEAN
        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(isHeads);
    }
}
