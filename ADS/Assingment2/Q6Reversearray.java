public class Q6Reversearray {
    public static void main (String [] args) {
         int arr [] = {1,2,3,4};
         for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr [i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = temp;
         }

       for (int i = 0; i< arr.length; i++) {
        System.out.println(arr[i]);
       } 
    }  
    
    
}





