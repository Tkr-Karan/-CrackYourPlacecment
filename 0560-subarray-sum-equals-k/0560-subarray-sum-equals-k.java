class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // optimising using Hashmap
        int n = nums.length;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        
        int cnt = 0;
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            
            if(hm.containsKey(sum - k)){
                cnt += hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        
        
        
        // brute force
        // int n = nums.length;
        
//         int[] pf= new int[n];
        
//         pf[0] = nums[0];
        
//         for(int i = 1; i < n; i++){
//             pf[i] = pf[i-1] + nums[i];
//         }
        
        
//         int cnt = 0;
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 if(i == 0){
//                     sum = pf[j];
                   
//                 }else{
//                     sum = pf[j] - pf[i-1];
//                 }
                
           
//                  if(sum == k) cnt++;
//             }
//         }
        
        return cnt;
    }
}