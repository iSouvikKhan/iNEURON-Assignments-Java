
// WAP to sort an array using Selection Sort Algorithm




package Assignment_3;

import java.util.Arrays;

public class Question_5 {
    public static void main(String[] args) {
        int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

        selection(arr);

        System.out.println(Arrays.toString((arr)));
    }

    public static void selection(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int smallestElement = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallestElement] > arr[j])
                    smallestElement = j;
            }
            int temp = arr[i];
            arr[i] = arr[smallestElement];
            arr[smallestElement] = temp;
        }
    }
}
