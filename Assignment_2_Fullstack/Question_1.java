
// WAP to find the duplicates present in an array.


package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_1 {
    public static void main(String[] args) {
        int[]arr = new int[]{5,9,3,8,4,7,8,2,5,3,8,9,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> al = new ArrayList<Integer>();
        int pointerA = 0;
        int pointerB = 1;
        while(pointerA != arr.length-2){
            if(arr[pointerA] == arr[pointerB] && al.size()>0 && arr[pointerA]==al.get(al.size()-1))
            {
                pointerA++;
                pointerB++;
            }
            else if(arr[pointerA] == arr[pointerB])
            {
                al.add(arr[pointerB]);
                pointerA++;
                pointerB++;
            }
            else
            {
                pointerA++;
                pointerB++;
            }
        }
        System.out.println(al);
    }
}
