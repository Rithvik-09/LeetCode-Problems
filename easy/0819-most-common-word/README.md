# Most Common Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Note that words can not contain punctuation symbols.

 
Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.


Example 2:

Input: paragraph = "a.", banned = []
Output: "a"


 
Constraints:


	1 <= paragraph.length <= 1000
	paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
	0 <= banned.length <= 100
	1 <= banned[i].length <= 10
	banned[i] consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 35.73%)  
**Memory:** 45 MB (beats 46.34%)  
**Submitted:** 2026-09-01T13:01:36.241Z  

```java
import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String str[] = paragraph.split("\\s+");

        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> ban = new HashSet<>();

        for (String b : banned) {
            ban.add(b.toLowerCase());
        }

        for (String s : str) {
            if (!ban.contains(s)) {
                hm.put(s, hm.getOrDefault(s, 0) + 1);
            }
        }

        String answer = "";

        for (String word : hm.keySet()) {
            if (answer.equals("") || hm.get(word) > hm.get(answer)) {
                answer = word;
            }
        }

        return answer;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/most-common-word/)