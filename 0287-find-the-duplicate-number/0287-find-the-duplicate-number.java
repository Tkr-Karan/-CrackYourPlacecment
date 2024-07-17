class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> hs = new HashSet<>();
        int res = 0;
        for(int i = 0; i < n; i++){
            if(hs.contains(nums[i])) res = nums[i];
            else hs.add(nums[i]);
        }

        return res;
    }
}