import java.util.Scanner;

public class CompoundInterestCalculator {
    private double principal;               
    private double annualInterestRate;     
    private int numberOfCompounds;         
    private int years;                      
    private double futureValue;             
    private double totalInterest;           

    // Getter and Setter for Principal
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    
    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    
    public double getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(double futureValue) {
        this.futureValue = futureValue;
    }

    
    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        setPrincipal(sc.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        setAnnualInterestRate(sc.nextDouble() / 100);

        System.out.print("Interest is compounded per year: ");
        setNumberOfCompounds(sc.nextInt());

        System.out.print("Enter the investment duration (in years): ");
        setYears(sc.nextInt());
    }

    
    public void calculateFutureValue() {
        double ratePerCompound = getAnnualInterestRate() / getNumberOfCompounds();
        futureValue = getPrincipal() * Math.pow((1 + ratePerCompound), (getNumberOfCompounds() * getYears()));
        totalInterest = futureValue - getPrincipal();
    }

    
    public void printRecord() {
        System.out.println("Future Value of the investment: "+ getFutureValue());
        System.out.println("Total Interest Earned: "+ getTotalInterest());
    }

    
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();            
        calculator.calculateFutureValue();   
        calculator.printRecord();             
    }
}
