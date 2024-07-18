class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])) res.add(nums[i]);
            else hs.add(nums[i]);
        }
        
        return res;
        
        
        // method 1
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             int cnt = 1;
//             for(int j = i+1; j < n; j++){
//                 if(nums[i] == nums[j]) cnt++;
//             }
//             if(cnt == 2){
//                 res.add(nums[i]);
//             }
//         }
        
//         return res;
    }
}