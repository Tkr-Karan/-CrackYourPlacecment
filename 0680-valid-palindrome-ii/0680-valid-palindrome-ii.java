class Solution {
    
    public boolean isPalin(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int n = s.length();
        
        
        int i = 0, j = n-1;
        
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalin(s, i+1, j) || isPalin(s, i, j-1);
            }
            i++;
            j--;
        }
        
        return true;
    }
}