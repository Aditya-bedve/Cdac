
import java.util.Scanner;

public class Q5HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Welcome to HCF Calculator");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Please enter second number: ");
        int second = input.nextInt();

        
        int hcf = 1; 
        int least;
        if (first < second) {
            least = first;
        } else {
            least = second;
        }

        
        for (int i = 1; i <= least; i++) {
            if (first % i == 0 && second % i == 0) {
                hcf = i; 
            }
        }

        System.out.println("HCF of " + first + " and " + second + " is: " + hcf);
        
    }
}
