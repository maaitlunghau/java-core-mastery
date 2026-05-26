public class StringMethods {
    public static void main(String[] args) {

        String username = "maaitlunghau";
        String password = "";

        int length = username.length();
        char letter = username.charAt(0);
        int index = username.indexOf("h");
        int lastIndex = username.lastIndexOf("a");

        // username = username.toLowerCase(); // maaitlunghau
        // username = username.toUpperCase(); // MAAITLUNGHAU
        // username = username.trim();
        // username = username.replace("m", "M"); // Maaitlunghau

        System.out.println(length); // 12
        System.out.println(letter); // m
        System.out.println(index); // 9
        System.out.println(lastIndex); // 10

        // isEmpty() method
        // isBlank() method
        if (username.isEmpty() || username.isBlank())
            System.out.println("Your username is empty.");
        else
            System.out.println("Hello " + username);

        // contains() method
        if (username.contains(" "))
            System.out.println("Your username contains a space");
        else
            System.out.println("Your username doesn't contain a space");

        // equals() method
        if (password.equals("password"))
            System.out.println("Login successfully");
        else
            System.out.println("Failed to login to website!");

        // equalsIgnoreCase() method
        if (password.equalsIgnoreCase("PassWord"))
            System.out.println("Login successfully");
        else
            System.out.println("Failed to login to website!");
    }
}
