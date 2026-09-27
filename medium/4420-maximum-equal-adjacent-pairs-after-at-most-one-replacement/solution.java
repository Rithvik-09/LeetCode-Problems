class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int base = 0;

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            int a = nums[i];
            int b = nums[i+1];

            if(a == b){
                base++;
            }else{

                int x = Math.min(a,b);
                int y = Math.max(a,b);

                String key = x + "#" + y;
                map.put(key,map.getOrDefault(key,0) + 1);
            }
        }

        int maxGain = 0;

        for(int count : map.values()){
            maxGain = Math.max(maxGain,count);
        }
        return base + maxGain;
        
    }
}