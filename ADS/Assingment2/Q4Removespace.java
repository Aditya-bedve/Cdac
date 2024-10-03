
class Q4Removespace {
    public static void main (String [] args) {
        String str = "Welcome to java programming";
        String string = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch != ' ') {
                string = string + ch;
            }
        }
        System.out.println(string);
    }
}



