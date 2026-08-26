                ans[pos] = nums[i];
            }else{
                pos +=2;
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
