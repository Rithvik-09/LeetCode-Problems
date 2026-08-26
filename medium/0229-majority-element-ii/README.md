# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

 
Example 1:

Input: nums = [3,2,3]
Output: [3]


Example 2:

Input: nums = [1]
Output: [1]


Example 3:

Input: nums = [1,2]
Output: [1,2]


 
Constraints:


	1 <= nums.length <= 5 * 104
	-109 <= nums[i] <= 109


 
Follow up: Could you solve the problem in linear time and in O(1) space?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-08-26T10:05:32.874Z  

```java

            if(hm.get(nums[i])== mini){
                res.add(nums[i]);
            }
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        for(int i=0;i<n;i++){

        int mini = n / 3 + 1;
        HashMap<Integer,Integer> hm = new HashMap<>();

            if(res.size() == 2) break;
        }
        return res;
    }

```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)