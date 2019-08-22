package com.company;

import java.util.HashMap;

public class Main {
    public static void findPair(int[] array, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<array.length; i++){
            if (map.containsKey(target - array[i])){
                System.out.println(i + " " + map.get(target - array[i]));
                break;
            }
            map.put(array[i],i);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = {8,7,2,5,3,1};
        int sum  = 10;
        findPair(array,sum);
    }
}
