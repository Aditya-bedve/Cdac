public class Q1Armstrong {
   
        public static void main(String[] args) {
            int number = 153; 
            int originalNumber = number; 
            int sum = 0; 
            int count = 0;
            for (int temp = number; temp != 0; temp /= 10) {
                count++;
            }
    
          
            for (int temp = originalNumber; temp != 0; temp /= 10) {
                int digit = temp % 10; 
                int power = 1; 
    
               
                for (int i = 0; i < count; i++) {
                    power *= digit; 
                }
    
                sum += power; 
            }
             System.out.println(originalNumber == sum);
        }
    }

