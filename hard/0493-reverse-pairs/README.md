# Reverse Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:


	0 <= i < j < nums.length and
	nums[i] > 2 * nums[j].


 
Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1


Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1


 
Constraints:


	1 <= nums.length <= 5 * 104
	-231 <= nums[i] <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.1 MB  
**Submitted:** 2026-08-26T10:17:53.412Z  

```java
        int count = 0;

        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-pairs/)