class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n/2;

        long total = 0;

        for(int num : nums){
            total += num;
        }

        long firstsum = 0;

        for(int i=0;i<half;i++){
            firstsum += nums[i];
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            long lastsum = total - firstsum;

            if(firstsum > lastsum){
                ans++;
            }

            firstsum -= nums[i];
            firstsum += nums[(i+half) % n];
        }
        return ans;
    }
}