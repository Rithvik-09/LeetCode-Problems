# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

**Example 1:**

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

**Example 2:**

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

**Constraints:**

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 22 ms (beats 13.28%)  
**Memory:** 49 MB (beats 32.30%)  
**Submitted:** 2026-09-24T14:06:40.746Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];

        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }

        for(int i=0;i<n;i++){
            arr[i+m] = nums2[i];
        }

        for(int i=0;i<arr.length-1;i++){
            int f = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    f = 1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(f == 0) break;
        }

        int len = arr.length;

        if(len % 2 == 0){
            return (arr[len/2 - 1] + arr[len/2]) / 2.0;
        }
        
        return arr[len/2];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)