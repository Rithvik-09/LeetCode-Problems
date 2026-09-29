# Remove Duplicate Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, remove duplicate letters so that every letter appears once and only once. You must make sure your result is **the smallest in lexicographical order** among all possible results.

 

**Example 1:**

```
Input: s = "bcabc"
Output: "abc"

```

**Example 2:**

```
Input: s = "cbacdcbc"
Output: "acdb"

```

 

**Constraints:**

- 1 <= s.length <= 104
- s consists of lowercase English letters.

 

**Note:** This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 79.29%)  
**Memory:** 43.9 MB (beats 41.43%)  
**Submitted:** 2026-09-29T16:14:54.007Z  

```java
import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[] = new int[26];
        boolean found[] = new boolean[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;

            if(found[ch - 'a']){
                continue;
            }

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek()-'a'] > 0){
                found[st.pop() - 'a'] = false;
            }
            st.push(ch);
            found[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicate-letters/)