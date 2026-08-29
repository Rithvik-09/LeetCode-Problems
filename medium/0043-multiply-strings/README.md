# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 
Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

 
Constraints:


	1 <= num1.length, num2.length <= 200
	num1 and num2 consist of digits only.
	Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 2 ms  
**Memory:** 43 MB  
**Submitted:** 2026-08-29T13:00:23.673Z  

```java
        }
        
        int n3 = n1 * n2;

        String result = "";

        while(n3 > 0){
            int digit = n3 % 10;
            result = (char)('0' + digit) + result;
            n3 = n3/10;
        }
    }
        return result;
}

```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)