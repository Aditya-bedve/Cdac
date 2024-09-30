import java.util.Scanner;

public class Q4Fibbonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number series is to be printed:");
        int num = input.nextInt();
        
        if (num >= 0) {
            System.out.print("0 ");
        }

        if (num >= 1) {
            System.out.print("1 ");
        }

        int first = 0, second = 1;

        for (int i = 2; first + second < num; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
           second = third;
        }

        
    }
}

