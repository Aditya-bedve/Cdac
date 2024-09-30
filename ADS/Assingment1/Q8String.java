


class Q8String {
    public static void main(String[] argv) {
        String str = "stress";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
                if (j == str.length() - 1) {  
                    System.out.println(str.charAt(i));
                }
            } 
        } 
    }
} 