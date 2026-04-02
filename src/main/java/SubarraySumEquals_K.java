import java.util.HashMap;
import java.util.Map;

public class SubarraySumEquals_K {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixSums = new HashMap<>();
        int sum = 0;
        int res =0;

        for(int i=0; i< nums.length; i++){
            sum += nums[i];

            if(sum == k){
                res++;
            }

            if(prefixSums.containsKey(sum-k)){
                res += prefixSums.get(sum-k);
            }
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0)+1);
        }
        return res;

    }
}
/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */