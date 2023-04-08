//LEETCODE
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.

class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=nums[i];
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,max);
                max *=nums[j];
            }
            ans=Math.max(ans,max);
        }
        return ans;
    }
}

//OUTPUT--
//Example 1:
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.

//Example 2:
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
