import java.util.Scanner;

class DiscountCalculator {
     double originalPrice;
     double discountRate;
     double discountAmount;
     double finalPrice;

   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item (in ₹): ");
        originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();
    }

    
    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.println("Discount Amount: "+ discountAmount);
        System.out.println("Final Price: "+ finalPrice);
    }

    
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        
        calculator.acceptRecord(); 
        calculator.calculateDiscount();
        calculator.printRecord(); 
    }
}
