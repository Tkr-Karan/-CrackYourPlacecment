class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        
        int dblDigit = 0;
        int singleDigit = 0;
        
        for(int i = 0 ; i < n; i++){
            if(nums[i] > 9) dblDigit += nums[i];
            else singleDigit += nums[i];
        }
        
        int aliceSum = 0;
        
        if(singleDigit > dblDigit) return true;
        else if(dblDigit > singleDigit) return true;
        else return false; 
    }
}