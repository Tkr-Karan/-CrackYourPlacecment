class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
//         Optimize Solution
        int maxArea = Integer.MIN_VALUE;
        
        int i = 0, j = n-1;
        
        int area = 0;
        while(i < j){
            int width = Math.min(height[i], height[j]);
            int length = j - i;
            
            area = length * width;
            
            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
            
            maxArea = Math.max(area, maxArea);
        }
        
        return maxArea;
        
        
        // Brute Force
        
//         int maxArea = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             int area = 0;
//             for(int j = i+1; j < n; j++){
//                 area =  Math.max(area, (Math.min(height[i], height[j]) * (j-i)));
//                 maxArea = Math.max(area, maxArea);
//             }
//         }
        
//         return maxArea;
    }
}