import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] selectionSortArr = randomArray(25);
        System.out.println("Unsorted Array: " + Arrays.toString(selectionSortArr));
        selectionSort(selectionSortArr);
        System.out.println("Sorted Array:   " + Arrays.toString(selectionSortArr));
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
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int temp;
        int minIndex;
        for (int i = 0; i < n - 1; i++ ) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }    
                    temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                
        }
    }
}
