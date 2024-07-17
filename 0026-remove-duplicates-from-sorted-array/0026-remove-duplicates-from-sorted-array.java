class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] != nums[index-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}