class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }

        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int count = 0;

        while(i<nums.length && j<nums.length){
            if(i == j){
                j++;
                continue;
            }

            int diff = nums[j] - nums[i];

            if(diff < k){
                j++;
            }else if(diff > k){
                i++;
            }else{
                count++;
                int left = nums[i];
                int right = nums[j];

                while(i <nums.length && nums[i] == left){
                    i++;
                }

                while(j < nums.length && nums[j] == right){
                    j++;
                }
            }
        }
        return count;
    }
}