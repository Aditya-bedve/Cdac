import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        // Declare an array of 5 integers
        int[] arr = new int[5];

        // Call the methods
        acceptRecord(arr);
        printRecord(arr);
    }

    // Method to accept input from the user into the array
    public static void acceptRecord(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // Method to print the current state of the array
    public static void printRecord(int[] arr) {
        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

