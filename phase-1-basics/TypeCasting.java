public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting = converting a value of one data type into another data type
        // bahaves differently depending on memory size changes

        // Widening Casting (Implicit: ngầm định / Automatically)
        // convert a smaller type to a larger type size
        // no data loss occurs (an toàn tuyệt đối, không mất dữ liệu)
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (Explicit: rõ ràng, minh bạch / Manually)
        // convert a larger type to a smaller type size
        // Risk of data loss or truncation (nguy cơ mất dữ liệu hoặc sai lệch số)
        // Must be done manually by placing the type in parentheses: (target_type)
        // 📉 double -> float -> long -> int -> char -> short -> byte

        // ==========================================
        // 1. WIDENING CASTING EXAMPLES
        // ==========================================
        int num = 9;
        double numDouble = num;

        System.out.println("--- Widening ---");
        System.out.println("Integer value: " + num); // 9
        System.out.println("Double value: " + numDouble); // 9.0

        // ==========================================
        // 2. NARROWING CASTING EXAMPLES
        // ==========================================
        double pi = 3.14159;
        int truncatedPi = (int) pi;

        System.out.println("\n--- Narrowing (Truncation) ---");
        System.out.println("Original Double: " + pi); // 3.14159
        System.out.println("Truncated Integer: " + truncatedPi); // 3

        // ==========================================
        // 💡 3. REAL-WORLD PRACTICAL USE CASES
        // ==========================================

        // Case A: Correcting Integer Division in Math
        int totalItems = 5;
        int totalContainers = 2;

        // ❌ Wrong: 5 / 2 = 2 (integer math), then converted to 2.0
        double wrongResult = totalItems / totalContainers;

        // ✅ Right: Cast one operand to double first -> triggers decimal math (5.0 / 2)
        double correctResult = (double) totalItems / totalContainers;

        System.out.println("\n--- Practical Case: Division ---");
        System.out.println("Wrong division result: " + wrongResult); // 2.0
        System.out.println("Correct division result: " + correctResult); // 2.5

        // Case B: Char <-> Int Conversion (ASCII / Unicode codes)
        char letter = 'A';

        // Automatically Widens char to int (gets ASCII code)
        int asciiValue = letter;

        // Manually Narrows int back to char
        int nextAsciiValue = 66;
        char nextLetter = (char) nextAsciiValue;

        System.out.println("\n--- Practical Case: Char & Int ---");
        System.out.println("Character '" + letter + "' has ASCII code: " + asciiValue); // 65
        System.out.println("ASCII code " + nextAsciiValue + " represents character: " + nextLetter); // 'B'
    }
}
