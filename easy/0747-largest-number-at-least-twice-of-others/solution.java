class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1;
        int secondLargest = -1;
        int ind = -1;

        for(int i =0;i<nums.length;i++){
            if(nums[i] >largest){
                secondLargest = largest;
                largest = nums[i];
                ind = i;
            }else if(nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        }   

        if(largest >= 2* secondLargest){
            return ind;
        } 
        return -1;
    }
}