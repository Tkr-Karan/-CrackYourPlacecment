class Solution {
    public String reverseWords(String s) {
        s.trim();
        
        StringBuilder ans = new StringBuilder();
        String[] res = s.split("\\s+");
        
        for(int i = res.length-1; i >= 0; i--){
            
            ans.append(res[i]);
            if(i > 0) ans.append(" ");
        }
        
        return ans.toString().trim();
    }
}