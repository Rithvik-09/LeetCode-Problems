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