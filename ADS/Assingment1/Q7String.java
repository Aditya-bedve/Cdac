
public class Q7String {
    public static void main (String [] args) {
        String string = "Programming";
        for (int i = 0; i < string.length(); i++){
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    System.out.println(string.charAt(i));
                }
            }
        } 
    }

}














