import java.util.Arrays;

public class BubbleSort {

 
    public static void main(String[] args) {
        
        int[] bubbleArr = randomArray(25);
        System.out.println("Unsorted Array: " + Arrays.toString(bubbleArr));
        bubbleSort(bubbleArr);
        System.out.println("Sorted Array:   " + Arrays.toString(bubbleArr));
        
    }
    
    /*method creates an unsorted array of pseudo-random numbers. Accepts array
    length as argument
    */
    public static int[] randomArray(int l) { 
        int[] result = new int[l];
            for (int i = 0; i < result.length; i++){
             result[i] = (int) (Math.random() * 100);
            } 
        return result;
    }
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int n = arr.length;
        int temp;
         for (int i = 0; i < n - 1; i++) {
            if (swapped == true) {
            swapped = false;
                for (int j = 0; j < n - 1 - i; j++ ){
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }             
                }
            }
        }
    }  
}
