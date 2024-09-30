import java.util.Scanner;

public class Q2Primecheck {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("number is not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Number is not prime");
                    return;
                }
            }
            System.out.println("Number is prime"); 
        }
    }

}

