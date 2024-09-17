import java.util.Scanner;

class loanCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    
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

   
    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        setPrincipal(scanner.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        setAnnualInterestRate(scanner.nextDouble());

        System.out.print("Enter the loan term (years): ");
        setLoanTerm(scanner.nextInt());
    }

   
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
        int numberOfMonths = getLoanTerm() * 12;

        
        return getPrincipal() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
               (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    
    public void printRecord(double monthlyPayment) {
        double totalPayment = monthlyPayment * getLoanTerm() * 12;

       
        System.out.println(this.toString());
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }

   
    @Override
    public String toString() {
        return "Loan Details: " +
               "Principal Amount:  " + getPrincipal() + "\n" +
               "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
               "Loan Term: " + getLoanTerm() + " years";
    }

    
    public static void main(String[] args) {
        loanCalculator calculator = new loanCalculator();
        calculator.acceptRecord();
        double monthlyPayment = calculator.calculateMonthlyPayment();
        calculator.printRecord(monthlyPayment);
    }
}



