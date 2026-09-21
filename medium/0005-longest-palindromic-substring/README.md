# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return *the longest* *palindromic* *substring* in `s`.

 

**Example 1:**

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

**Example 2:**

```
Input: s = "cbbd"
Output: "bb"

```

 

**Constraints:**

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 92.15%)  
**Memory:** 43.6 MB (beats 60.01%)  
**Submitted:** 2026-09-21T15:19:58.338Z  

```java
class Solution {
    public String longestPalindrome(String s) {
            if(s.length() < 2){
                return s;
            }

            int st = 0;
            int e = 0;

            for(int i = 0;i<s.length();i++){
                int l1 = expand(s,i,i);
                int l2 = expand(s,i,i+1);

                int l = Math.max(l1,l2);

                if(l > e - st + 1){
                    st = i - (l - 1)/2;
                    e = i + l/2;
                }
            }
        return s.substring(st,e + 1);
    }

    private int expand(String s,int l,int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ){
            l--;
            r++;
        }
        return r - l -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)