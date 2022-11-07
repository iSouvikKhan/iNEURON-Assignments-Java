
// WAP to sort an array using Merge Sort Algorithm



package Assignment_3;

import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {
        int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

        divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[]arr, int si, int ei){
        if(si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[]arr, int si, int mid, int ei){
        int []newarr = new int[ei+1-si];
        int id1 = si;
        int id2 = mid+1;
        int x = 0;
        while(id1 <= mid && id2 <= ei){
            if(arr[id1] <= arr[id2]){
                newarr[x++] = arr[id1++];
            }else{
                newarr[x++] = arr[id2++];
            }
        }
        while(id1 <= mid)
            newarr[x++] = arr[id1++];
        while(id2 <= ei)
            newarr[x++] = arr[id2++];
        for(int i=0,j=si;i<newarr.length;i++,j++){
            arr[j] = newarr[i];
        }
    }
}
