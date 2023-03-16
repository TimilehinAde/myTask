package com.timmy.dataCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sum {
//    public int[] intersect(int[] nums1, int[] nums2) {
//
//        if(nums1 == null || nums2 == null || nums1.length==0  || nums2.length==0)
//            return new int[0];
//        // step1: Put elements in nums1 into the map
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num:nums1)
//            if(map.containsKey(num))
//                map.put(num,map.get(num)+1);
//            else
//                map.put(num,1);
//// step 2: iterate the nums2 and get the result
//        List<Integer> result = new ArrayList<>();
//
//        for (int num : nums2) {
//            if (map.containsKey(num) && map.get(num) > 0)
//            {   result.add(num);
//                int freq = map.get(num);
//                freq--;
//                map.put(num, freq);
//            }
//        }
//
//        return listToArray(result);
//    }
//
//    private int[] listToArray(List<Integer> list) {
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//
//        return result;
//    }




public int[] intersect(int[] nums1, int[] nums2) {


    if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
        return new int[0];
    }

    int i = 0;
    int j = 0;

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    List<Integer> result = new ArrayList<>();

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] == nums2[j]) {
            result.add(nums1[i]);
            i++;
            j++;
        } else if (nums1[i] < nums2[j]){
            i++;
        } else {
            j++;
        }
    }

    // Convert list to array
    return listToArray(result);
}


    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}



