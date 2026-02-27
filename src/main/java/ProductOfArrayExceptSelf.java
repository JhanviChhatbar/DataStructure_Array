public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        output[0] = 1;
        for(int i=1; i<n;i++){
            output[i] = output[i-1] * arr[i-1];
        }

        int suffix = 1;

        for(int i = n-1; i>=0; i--){
            output[i] = output[i] * suffix;
            suffix = suffix * arr[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);

        for (int val : res)
            System.out.print(val + " ");
    }
}
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */