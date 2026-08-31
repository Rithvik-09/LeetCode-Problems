# Rotate List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the head of a linked list, rotate the list to the right by k places.

 
Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]


Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]


 
Constraints:


	The number of nodes in the list is in the range [0, 500].
	-100 <= Node.val <= 100
	0 <= k <= 2 * 109

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-31T14:12:25.141Z  

```java

        if (k == 0) {
            return head;
        }

        tail.next = head;

        int nth = n - k - 1;
        ListNode last = head;

        for (int i = 0; i < nth; i++) {
            last = last.next;
        }


```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)