class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        
        Arrays.sort(strs);  // TC :O(N*logN)
        
        String first = strs[0];
        String second = strs[n-1];
        
        int indx = 0;
        
        while(indx < first.length() && indx < second.length()){
            if(first.charAt(indx) == second.charAt(indx)) indx++;
            else break;
        }
        
        
        return first.substring(0, indx);
        
        
        
//         Method 2;
        
//         int minLen = Integer.MAX_VALUE;
        
//         for(int i = 0; i < n; i++){
//             minLen = Math.min(minLen, strs[i].length());
//         }
        
//         StringBuilder res = new StringBuilder();
//         for(int i = 0; i < minLen; i++){
//             boolean isCommon = true;
            
//             for(int j = 0; j < n; j++){
//                 if(strs[j].charAt(i) != strs[0].charAt(i)){
//                     isCommon = false;
//                     break;
//                 }
//             }
            
//             // checking if we found the common or not i
//             // if we found add in res other break the loop and print the result
//             if(isCommon == true) res = res.append(strs[0].charAt(i));
//             else break;
//         }
        
//         return res.toString();
        
        
        // Brute Force
        
//         int n = strs.length;
        
//         String prefix = strs[0];
        
//         for(int i = 1; i < n; i++){
//             while(strs[i].indexOf(prefix) != 0){
//                 prefix = prefix.substring(0, prefix.length()-1);
//             }
//         }
        
//         return prefix;
    }
}