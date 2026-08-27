        }   
            }else if(nums[i]>secondLargest){
                secondLargest = nums[i];
            }

        if(largest > 2* secondLargest){
            return ind;
        } 
        return -1;
    }
}
