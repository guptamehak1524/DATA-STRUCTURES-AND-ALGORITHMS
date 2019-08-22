package com.company;

import java.util.*;

public class Main {

    public static boolean zeroSumExists(int[] A){
        HashSet<Integer>set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for (int i = 0; i<A.length; i ++) {
            sum += A[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = {3,4,-7,3,1,3,1,-4,-2,-2};
        if (zeroSumExists(array)){
            System.out.println("Exists");
        }
        else {
            System.out.println("does not exist");
        }
    }
}
