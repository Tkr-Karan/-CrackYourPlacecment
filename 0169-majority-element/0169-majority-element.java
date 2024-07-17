class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        int unq = 0;
        // optimise solution using bit manipulation
        for(int i= 0; i < 32; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                int val = nums[j] >> i;
                if((val & 1) != 0) cnt++;
            }

            if(cnt > n/2){
                unq = unq | (1 << i);
            }
        }

        return unq;

        // optimise solution using hashmap
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // for(int i = 0; i < n; i++){
        //     int val = nums[i];
        //     freq.put(val, freq.getOrDefault(val, 0)+1);
        // }

        // int res = 0;
        // for(int key : freq.keySet()){
        //     if(freq.get(key) > n/2) {
        //         res = key;
        //         break;
        //     }
        // }
        // return res;
        
        
        // brute force
        // int res = 0;
        // for(int i = 0 ; i < n; i++){
        //     int freq = 0;
        //     for(int j = i+1; j < n; j++){
        //         if(nums[i] == nums[j]) freq++;
        //     }
        //     if(freq >= n/2) res = nums[i];
        // }
        // return res;
    }
}