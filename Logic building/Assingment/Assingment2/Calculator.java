import java.util.Scanner;



public class Calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter the arithmatic opreation + - * /");
        char opreator = scanner.next().charAt(0);
        int result = 0;

        switch (opreator) {
            case '+':
             result = num1 + num2;
             System.out.println(result);
             break;

            case '-':
             result = num1 - num2;
             System.out.println(result);
             break;
             
            case '*':
             result = num1 * num2;
             System.out.println(result);
             break;

            case '/':
             result = num1 / num2; 
             System.out.println(result);
             break;
        
            default:
            System.out.println("Enter valid opreation");
            break;
        }
    }
}
