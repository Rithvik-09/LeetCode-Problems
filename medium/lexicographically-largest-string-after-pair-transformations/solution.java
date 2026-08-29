class Solution {
    public String[] largestString(int[] nums) {
        String[] ans = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            int x = nums[i];

            StringBuilder sb = new StringBuilder();

            for(int bit = 30;bit >=0;bit--){
                if((x &(1 << bit)) != 0){
                    sb.append((char)('a' + bit));
                }
            }

            ans[i] = sb.toString();
        }
        return ans;
    }
}