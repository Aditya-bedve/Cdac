import java.util.Scanner;

public class BMITracker {
    private double weight;
    private double height;
    private double bmi;
    private String classification;

    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public double getBMI() {
        return bmi;
    }

    
    public String getClassification() {
        return classification;
    }

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in kilograms): ");
        setWeight(scanner.nextDouble());
        System.out.print("Enter height (in meters): ");
        setHeight(scanner.nextDouble());
    }


    public void calculateBMI() {
        if (getHeight() > 0) {
            bmi = getWeight() / (getHeight() * getHeight());
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
        System.out.println("Your BMI is: " + getBMI());
        System.out.println("Classification: " + getClassification());
    }

    
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}
