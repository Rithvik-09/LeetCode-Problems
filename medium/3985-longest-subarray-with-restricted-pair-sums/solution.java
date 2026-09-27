class Solution {
    public int maxSubarray(int[] nums) {
         
         int n = nums.length;
         int left = 0;
         int ans = 1;

        Map<Integer,Integer> freq = new HashMap<>();

        for(int right = 0;right<n;right++){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);

        while(!isValid(freq)){
            int x = nums[left];

            freq.put(x,freq.get(x) - 1);

            if(freq.get(x) == 0){
                freq.remove(x);
            }
            left++;
        }
        ans = Math.max(ans,right - left + 1);
    }
    return ans;
}

    private boolean isValid(Map<Integer,Integer> freq){
        List<Integer> values = new ArrayList<>(freq.keySet());

        for(int i=0;i<values.size();i++){
            for(int j = i;j<values.size();j++){
                int a = values.get(i);
                int b = values.get(j);

                if(a == b && freq.get(a) < 2){
                    continue;
                }

                int sum = a + b;

                if(freq.containsKey(sum)){
                        int needed = 1;

                    if(sum == a)needed++;
                    if(sum == b)needed++;

                    if(freq.get(sum) >= needed){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}