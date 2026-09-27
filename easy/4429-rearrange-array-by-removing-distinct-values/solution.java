class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        while(!map.isEmpty()){
            List<Integer> keys = new ArrayList<>(map.keySet());

            for(int key : keys){
                ans.add(key);

                int freq = map.get(key);

                if(freq == 1){
                    map.remove(key);
                }else{
                    map.put(key,freq - 1);
                }
            }
        }

        int[] result = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}