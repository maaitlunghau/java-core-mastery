public class Substring {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        // .substring(start, end)

        String email = "chunhau.py@gmail.com";

        // String username = email.substring(0, 10); // chunhau.py
        // String domain = email.substring(11); // gmail.com

        String username = email.substring(0, email.indexOf("@")); // chunhau.py
        int symbol = email.indexOf("@");
        String domain = email.substring(symbol + 1); // gmail.com

        System.out.println(username);
        System.out.println(email.charAt(symbol));
        System.out.println(domain);
    }
}
