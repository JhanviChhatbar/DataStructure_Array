import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(nums[i] > ans.get(ans.size() - 1)){
                ans.add(nums[i]);
            }

            else{
                int low = Collections.binarySearch(ans, nums[i]);
                if(low < 0)
                    low = -(low + 1);

                ans.set(low, nums[i]);
            }
        }

        return ans.size();
    }

}


/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.



Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1

 */