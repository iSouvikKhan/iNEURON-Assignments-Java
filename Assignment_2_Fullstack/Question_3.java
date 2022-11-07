
// WAP to sort an array using Bubble Sort Algorithm



package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
        bubbleSort(arr);
    }

    public static void bubbleSort(int[]arr) {
        for(int i=0;i<arr.length-1;i++) {
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
