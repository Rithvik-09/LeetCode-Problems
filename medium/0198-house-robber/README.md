# House Robber

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 
Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.


Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.


 
Constraints:


	1 <= nums.length <= 100
	0 <= nums[i] <= 400

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 75.34%)  
**Submitted:** 2026-08-26T06:49:48.939Z  

```java
class Solution {
    public int theft(int ind,int[] nums,int[] dp){
        if(ind == 0){
            return nums[0];
        }

        if(ind < 0){
            return 0;
        }

        if(dp[ind] != -1){
            return dp[ind];
        }

        int pick = nums[ind] + theft(ind - 2,nums,dp);
        int notpick = theft(ind -1,nums,dp);
        return dp[ind] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return theft(n-1,nums,dp);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/house-robber/)