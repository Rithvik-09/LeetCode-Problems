class Solution {
    public int maxArea(int[] height) {
        int l =0,r= height.length-1;
        int marea = 0;

        while(l<r){
            int width = r - l;
            int h = Math.min(height[l],height[r]);

            int area = width * h;

            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }

            marea = Math.max(marea,area);
        }

        return marea;
    }
}