        while(low<high){
            int mid = low + (high - low) /2;
        }

            if(nums[low]> nums[mid]){
                low = mid + 1;
            }else{
                high = mid;
            }

        int high = nums.length-1;

        return nums[low];
    }
