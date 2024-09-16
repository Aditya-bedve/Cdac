import java.util.Scanner;

public class BMITracker {
     double weight;
     double height;
     double bmi;
     String classification;

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in kilograms): ");
        weight = scanner.nextDouble();
        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();
    }

   
    public void calculateBMI() {
        if (height > 0) {
            bmi = weight / (height * height);
        } else {
            System.out.println("Height must be greater than zero.");
        }
    }

  
    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    
    public void printRecord() {
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Classification: " + classification);
    }

    
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}
