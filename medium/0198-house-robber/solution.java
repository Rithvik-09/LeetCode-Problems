        int notpick = theft(ind -1,nums,dp);
        return dp[ind] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return theft(n-1,nums,dp);
    }
}
