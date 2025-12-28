public class StringFunctionsDemo {
    public static void main(String[] args) {

        String name  = "shashi s";
        String title = "Ranjan";

        // length()
        System.out.println("Length of name: " + name.length());
        System.out.println("Length of title: " + title.length());

        // charAt()
        System.out.println("Character at index 2 of name: " + name.charAt(2));
        System.out.println("Character at index 3 of title: " + title.charAt(3));

        // substring()
        System.out.println("Substring of name (1 to 4): " + name.substring(1, 4));
        System.out.println("Substring of title (0 to 3): " + title.substring(0, 3));

        // equals()
        System.out.println("name equals title: " + name.equals(title));

        // equalsIgnoreCase()
        System.out.println("name equalsIgnoreCase \"rajiv\": " + name.equalsIgnoreCase("rajiv"));

        // toUpperCase()
        System.out.println("name in Uppercase: " + name.toUpperCase());
        System.out.println("title in Uppercase: " + title.toUpperCase());

        // toLowerCase()
        System.out.println("name in Lowercase: " + name.toLowerCase());
        System.out.println("title in Lowercase: " + title.toLowerCase());

        // trim()
        String demo = "  Rajiv Ranjan  ";
        System.out.println("Before trim: '" + demo + "'");
        System.out.println("After trim: '" + demo.trim() + "'");
    }
}