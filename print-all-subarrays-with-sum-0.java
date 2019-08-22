package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    private static void print(int start, int end, int[] array){
        for (int i = start; i <=end ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    // NAIVE SOLUTION
//    public static void findSubarrays(int[] array){
//        for (int i = 0;i<array.length; i++){
//            int sum  = 0;
//            for (int j = i; j<array.length; j++){
//                sum += array[j];
//                if (sum == 0 ){
//                    print(i,j, array);
//                }
//            }
//        }
//    }
    // USING MULTIMAP
    private static void insert(HashMap<Integer, List<Integer>> hashMap, int key, int value){
        if(!hashMap.containsKey(key)){
            hashMap.put(key, new ArrayList<>());
        }
        hashMap.get(key).add(value);
    }

    public static void printallSubarrays(int[] A){
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        insert(hashMap, 0, -1);
        int sum =0;
        for (int i = 0; i< A.length; i++){
            sum += A[i];
            if (hashMap.containsKey(sum)){
                List<Integer> list = hashMap.get(sum);
                for(Integer value: list){
                    print(value+1, i, A);
                }
            }
            insert(hashMap, sum, i);
        }
    }



    public static void main(String[] args) {
	// write your code here
        int[] array = {3,4,-7,3,1,3,1,-4,-2,-2};
        printallSubarrays(array);
    }
}
