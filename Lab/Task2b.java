// Date : 19 Jan
public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        // Using ==
        System.out.println("Using ==:");
        System.out.println(str1 == str2);  // false (different objects)
        System.out.println(str3 == str4);  // true (due to string interning)

        // Using equals
        System.out.println("\nUsing equals:");
        System.out.println(str1.equals(str2));  // true (same content)
        System.out.println(str3.equals(str4));  // true (same content)
    }
}
