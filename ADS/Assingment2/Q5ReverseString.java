public class Q5ReverseString {
    public static void main (String [] args) {
        String str = "Hello";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

    }
}