public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(200, 50); // only allowed to 2 numbers
        result = Math.min(10, 5); // only allowed to 2 numbers

        System.out.println(result);
    }
}