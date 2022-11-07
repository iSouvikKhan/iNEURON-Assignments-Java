
// WAP to check whether an array is a subset of another array




package Assignment_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Question_7 {
    public static void main(String[] args) {
        int[] arr1 = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
        int[] arr2 = {80, 10, 30, 40};
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<arr1.length;i++){
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }
        System.out.println(mp);

        System.out.println(mp.keySet());

        boolean val = check(mp, arr2);

        if(val)
            System.out.println(Arrays.toString(arr2) +" is a subset of "+ Arrays.toString(arr1));
        else
            System.out.println(Arrays.toString(arr2) +" is not a subset of "+ Arrays.toString(arr1));
    }

    public static boolean check(HashMap<Integer, Integer> mp, int[]arr){
        for(int key : mp.keySet()){
            if(mp.get(key) == 0){
                return false;
            }
        }
        return true;
    }
}
