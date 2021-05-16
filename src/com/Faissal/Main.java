package com.Faissal;

import jdk.internal.module.ModuleHashesBuilder;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
    Set<Integer> hashSet = new HashSet<>();

        int[] intArray ={3,4,5,9,0};
        System.out.println(containsDuplicate(intArray , hashSet));

        System.out.println(hashSet);

    }
    public static boolean containsDuplicate(int[] nums , Set<Integer> hashSet ) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) { for (int j = i + 1 ; j < nums.length; j++) {
            if( nums[i]==nums[j] && i != j ){
                hashSet.add(nums[i]);

                return true;
                }
            }
        }
        return false;


    }


}
