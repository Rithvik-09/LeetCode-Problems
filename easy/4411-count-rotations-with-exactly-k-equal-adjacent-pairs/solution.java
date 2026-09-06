class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int ans = 0;

        for(int i = 0;i<n;i++){
            int count =0;

            for(int j=0;j<n-1;j++){
                char a = s.charAt((i + j) % n);
                char b = s.charAt((i + j + 1) % n);

                if(a == b){
                    count++;
                }
            }
            if(count == k){
                ans++;
            }
        }
        return ans;
    }
}