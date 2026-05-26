public class Variables {
    public static void main(String[] args) {

        // ✅ variable = a reusable container for a value
        // a variable behaves as if it was the value it contains

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // always has a value (default value if not assigned)
        // có kích thước nhất định tuỳ vào kiểu dữ liệu (size depends on data type)
        // EX:
        // + int
        // + double
        // + char
        // + boolean

        // 🟦 Reference = memory address (stack) that points to the heap
        // có kích thước biến động tuỳ thuộc vào độ dài dữ liệu (size depends on data
        // length)
        // EX:
        // + string
        // + array
        // + object

        // 2 Steps to create a variable
        // ----------------------------
        // 1. declaration
        // 2. assignment

        int age = 30;
        int year = 2026, quantity = 1;

        double price = 19.99;
        double gpa = 4.0;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = !false; // true

        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are NOT a student!");
        }

        String empty = "";
        String name = "maaitlunghau";
        String food = "pizza";
        String email = "chunhau.py@gmail.com";
        String color = "black";

        if (forSale) {
            System.out.println("There is a " + color + " for sale!");
        } else {
            System.out.println("The " + color + " is NOT for sale!");
        }
    }
}
