class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];

        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }

        for(int i=0;i<n;i++){
            arr[i+m] = nums2[i];
        }

        for(int i=0;i<arr.length-1;i++){
            int f = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    f = 1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(f == 0) break;
        }

        int len = arr.length;

        if(len % 2 == 0){
            return (arr[len/2 - 1] + arr[len/2]) / 2.0;
        }
        
        return arr[len/2];
    }
}