# Q1. Count Integers Appearing in a Single Block

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array nums.

An integer x is special if all occurrences of x in nums appear in a single contiguous block.

Return the number of distinct special integers in nums.

 
Example 1:


Input: nums = [1,2,2,1]

Output: 1

Explanation:


	1 appears at indices 0 and 3, forming two separate blocks, so it is not special.
	2 appears in a single contiguous block at indices [1, 2], so it is special.


Therefore, there is one special integer.


Example 2:


Input: nums = [3,3,1,2,2,1]

Output: 2

Explanation:


	3 appears in a single contiguous block at indices [0, 1], so it is special.
	1 appears at indices 2 and 5, forming two separate blocks, so it is not special.
	2 appears in a single contiguous block at indices [3, 4], so it is special.


Therefore, there are two special integers.


 
Constraints:


	1 <= nums.length <= 100
	1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 100.00%)  
**Memory:** 43.9 MB (beats 100.00%)  
**Submitted:** 2026-08-30T03:05:50.366Z  

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> invalid = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int x = nums[i];

            if(seen.contains(x)){
                if(nums[i-1] != x){
                    invalid.add(x);
                }
            }else{
                seen.add(x);
            }
        }
        return seen.size() - invalid.size();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/)