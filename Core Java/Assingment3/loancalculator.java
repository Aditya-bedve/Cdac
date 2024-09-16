import java.util.Scanner;

class loancalculator {
   
     double principal;
     double annualInterestRate;
     int loanTerm;

   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        annualInterestRate = scanner.nextDouble();

         System.out.print("Enter the loan term (years): ");
        loanTerm = scanner.nextInt();

        
    }

    
    public double calculateMonthlyPayment() {
       
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        
        int numberOfMonths = loanTerm * 12;

       
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

    
    public void printRecord(double monthlyPayment) {
        // Calculate the total amount paid over the life of the loan
        double totalPayment = monthlyPayment * loanTerm * 12;

        // Display the results
        System.out.println("\nLoan Details:");
        System.out.println("Principal Amount: "+ principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Loan Term: "+  loanTerm);
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment " + totalPayment);
    }

   
    public static void main(String[] args) {
        
        loancalculator calculator = new loancalculator();

       
        calculator.acceptRecord();

      
        double monthlyPayment = calculator.calculateMonthlyPayment();

       
        calculator.printRecord(monthlyPayment);
    }
}


