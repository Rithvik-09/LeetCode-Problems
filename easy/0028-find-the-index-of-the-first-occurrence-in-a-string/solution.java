class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();

        for(int i=0;i<haystack.length();i++){
            if(haystack.substring(0,n).equals(needle)){
                return i;
            }
        }
    }
        return -1;
}
