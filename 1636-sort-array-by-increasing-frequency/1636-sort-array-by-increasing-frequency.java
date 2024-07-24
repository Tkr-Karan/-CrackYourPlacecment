class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int i = 0 ; i < n; i++){
            int val = nums[i];
            freqMap.put(val, freqMap.getOrDefault(val, 0)+1);
        }
        
        List<Integer> aList = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            aList.add(nums[i]);
        }
        
        Collections.sort(aList, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            
            if(freqA != freqB) return freqA-freqB;
            else return b - a;
        });
            
        for(int i = 0 ; i < aList.size(); i++){
            nums[i] = aList.get(i);
        }
        
        return nums;
    }
}