class Solution {
    public int strStr(String haystack, String needle) {
        
        int m = haystack.length();
        int n = needle.length();
        
        
        if(n > m) return -1;
        
        for(int i = 0; i < m-n+1; i++){
            System.out.println(haystack.substring(i, n+i) + needle);
            if(haystack.substring(i, n+i).equals(needle)) return i;
        }
        
        return -1;

        // return haystack.indexOf(needle);
    }
}