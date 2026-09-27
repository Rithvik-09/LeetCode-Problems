# Q1. Rearrange Array by Removing Distinct Values

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

You start with an **empty** array `ans`. Repeat the following operation until `nums` is **empty**:

- Identify all distinct values currently present in nums.
- Remove one occurrence of every distinct value currently in nums, and append those values to ans in ascending order.

Return the array `ans`.

 

**Example 1:**

**Input:** nums = [3,1,3,2,1,3]

**Output:** [1,2,3,1,3,3]

**Explanation:**

Operation	Appended to `ans`	`nums` after	`ans` after
1	1, 2, 3	`[3, 1, 3]`	`[1, 2, 3]`
2	1, 3	`[3]`	`[1, 2, 3, 1, 3]`
3	3	`[]`	`[1, 2, 3, 1, 3, 3]`

`nums` is now empty, so the answer is `[1, 2, 3, 1, 3, 3]`.

**Example 2:**

**Input:** nums = [7,7,4,4,4]

**Output:** [4,7,4,7,4]

**Explanation:**

Operation	Appended to `ans`	`nums` after	`ans` after
1	4, 7	`[7, 4, 4]`	`[4, 7]`
2	4, 7	`[4]`	`[4, 7, 4, 7]`
3	4	`[]`	`[4, 7, 4, 7, 4]`

`nums` is now empty, so the answer is `[4, 7, 4, 7, 4]`.

 

**Constraints:**

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 11 ms  
**Memory:** 48.1 MB  
**Submitted:** 2026-09-27T03:20:45.687Z  

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        while(!map.isEmpty()){
            List<Integer> keys = new ArrayList<>(map.keySet());

            for(int key : keys){
                ans.add(key);

                int freq = map.get(key);

                if(freq == 1){
                    map.remove(key);
                }else{
                    map.put(key,freq - 1);
                }
            }
        }

        int[] result = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rearrange-array-by-removing-distinct-values/)