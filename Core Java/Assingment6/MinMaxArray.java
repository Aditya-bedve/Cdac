import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Input values into the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int min = arr[0];
        int max = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
