import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Welcome to discount calculator");
        Scanner Scanner = new Scanner(System.in);
        int purchase = Scanner.nextInt();
        if (purchase > 1000) {
            System.out.println("20% discount");
        } else if (purchase > 500 && purchase < 999) {
            System.out.println("10% Discount");
        } else if (purchase < 500) {
            System.out.println("5% Discount");
        } 
        boolean Membership = true;
         if (Membership == true) {
            System.out.println("Additional 5% Discount");
         }
    }
}
