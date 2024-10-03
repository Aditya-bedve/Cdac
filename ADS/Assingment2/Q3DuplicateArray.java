public class Q3DuplicateArray {
    public static void main (String [] args) {
        int arr [] = {0,0,1,1,2,2,3,3};
        int count = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                count--;
            }
           
        }

         System.out.println(count);
    }
}
