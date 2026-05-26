import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // array = a collection of values of the same data types
        // * think of it as a variable that can store more than 1 value *

        String[] fruits = { "apple", "orange", "banana", "coconut" };

        // System.out.println(fruits); // [Ljava.lang.String;@103f852
        System.out.println(fruits[0]); // apple

        // EX01: output each element in array
        System.out.println();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // EX02: edit a element in array
        System.out.println();
        fruits[0] = "badminton";
        System.out.println(fruits[0]);

        // EX03:output each element in array by another method
        System.out.println();
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // EX04: sort element by ascending in array
        System.out.println();
        java.util.Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // EX05: fill all element into new element in array
        System.out.println();
        java.util.Arrays.fill(fruits, "pineapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // EX06: search in array
        System.out.println();
        int[] numbers = { 1, 2, 3, 4, 5, 2 };
        int target = 2;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("First Element found at index: " + i);
                break;
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        sc.nextLine();

        boolean hasFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                System.out.println("First Number found in array at index: " + i);
                hasFound = true;
                break;
            }
        }
        if (hasFound == false)
            System.out.println("Your number is not found in array...!");

        sc.close();
    }
}
