

import java.util.Scanner;

public class Q3Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to compute its factorial:");
        int num = scanner.nextInt();

        long fact = 1; 
        for (int i = 2; i <= num; i++) { 
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
