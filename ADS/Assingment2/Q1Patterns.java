public class Q1Patterns {
    public static void main (String [] args) {
        int num = 3;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}