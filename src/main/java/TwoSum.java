import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
     */
    
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            System.out.println(i);
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                ans[1] = i;
                ans[0] = map.get(temp);
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;

    }
}
