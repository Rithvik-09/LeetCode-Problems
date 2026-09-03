        int right = n-1;
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                boats++; 
            } else {
                right--; 
                left++;
                right--; 
                boats++;
            }
        }
        
    }
        return boats; 
