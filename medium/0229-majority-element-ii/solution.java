class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int mini = n / 3 + 1;

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            if(hm.get(nums[i])== mini){
                res.add(nums[i]);
            }

            if(res.size() == 2) break;
        }
        return res;
    }
}