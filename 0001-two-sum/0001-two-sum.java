class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] res = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int sum = nums[i] + nums[j];

                if(sum == target) {
                    res[0] = i;
                    res[1] = j;

                    return res;
                }
            }
        }
        
        return res;
        // int n = nums.length;

        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for(int i = 0; i < n; i++){
        //     int diff = target-nums[i];

        //     if(hm.containsKey(diff)){
        //         return new int[]{i, hm.get(diff)};
        //     } else{
        //         hm.put(nums[i], i);
        //     }
        // }

        // return new int[]{};

    }
}