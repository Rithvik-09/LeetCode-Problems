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