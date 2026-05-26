public class Array2D {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        String[] fruits = { "apple", "orange", "banana" };
        String[] vegetables = { "potato", "onion", "carrot" };
        String[] meats = { "chicked", "pork", "beef", "fish" };

        String[][] groceries = { fruits, vegetables, meats };

        // EX01: read & edit element in 2D array
        groceries[0][0] = "celery";
        System.out.println();

        // EX02: output 2D array
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
