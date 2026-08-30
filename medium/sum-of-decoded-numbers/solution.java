class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> invalid = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int x = nums[i];

            if(seen.contains(x)){
                if(nums[i-1] != x){
                    invalid.add(x);
                }
            }else{
                seen.add(x);
            }
        }
        return seen.size() - invalid.size();
    }
}