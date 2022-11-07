
// Insertion sort





package Assignment_3;

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {
        int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

        insertion(arr);

        System.out.println(Arrays.toString((arr)));
    }

    public static void insertion(int[]arr){
        for(int i = 1; i<arr.length;i++){
            int unsorted = arr[i];
            int sorted = i-1;
            while(sorted >= 0 && unsorted <= arr[sorted]){
                arr[sorted+1] = arr[sorted];
                sorted--;
            }
            arr[sorted+1] = unsorted;
        }
    }
}
