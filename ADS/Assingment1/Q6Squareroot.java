public class Q6Squareroot {
    public static void main (String [] args) {
        int num = 16;
        int squareroot = 0;
        for (int i = 0; i <= num; i++) {
            if (i * i == num) {
                squareroot = i;
                break;
            }
        }
        System.out.println ("The square root of a num " + squareroot);
    }
    
}