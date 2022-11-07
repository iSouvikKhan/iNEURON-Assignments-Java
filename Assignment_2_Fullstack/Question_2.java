
// WAP to sort an array using Quick Sort Algorithm


package Assignment_3;

import java.util.Arrays;

public class Question_2 {
    public static void main(String[] args) {
        int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

        Quick_sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void Quick_sort(int[] arr, int start, int end) {
        if (start >= end) { // BC
            return;
        }
        int mid = (start + end) / 2;
        int pivoot = arr[mid];
        int left = start;
        int right = end;

        while (left<=right) { // true
            while (arr[left] < pivoot) {
                left++;
            }
            while (arr[right] > pivoot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        Quick_sort(arr, start, right);
        Quick_sort(arr, left, end);

    }
}
