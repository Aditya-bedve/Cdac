public class Q7ReverseWords {
    public static void main (String [] args) {
        String str = "Hello World";
        char charArr [] = str.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 - i];
            charArr[charArr.length - 1 - i] = temp;
        }
        for (int i = 0; i< charArr.length; i++) {
            System.out.print(charArr[i]);
        }
    }
}
