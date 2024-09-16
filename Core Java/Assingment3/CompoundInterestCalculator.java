import java.util.Scanner;

public class CompoundInterestCalculator {

    private double principal;              
    private double annualInterestRate;      
    private int numberOfCompounds;          
    private int years;                      
    private double futureValue;             
    private double totalInterest;           

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial investment amount ");
        principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        annualInterestRate = sc.nextDouble() / 100; 

        System.out.print("interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        years = sc.nextInt();
    }

    
    public void calculateFutureValue() {
        futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds), (numberOfCompounds * years));
        totalInterest = futureValue - principal;
    }

    /
    public void printRecord() {
        System.out.printf("Future Value of the investment: ", futureValue);
        System.out.printf("Total Interest Earned: ", totalInterest);
    }

    
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();            
        calculator.calculateFutureValue();    
        calculator.printRecord();             
    }
}