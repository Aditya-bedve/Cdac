public class Q9Palindrome {
    public static void main(String[] args) {
        int number = 121;      
        int reversed = 0;      

       
        for (int temp = number; temp != 0; temp /= 10) {
            reversed = reversed * 10 + temp % 10;
        }

        
        if (number == reversed) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}