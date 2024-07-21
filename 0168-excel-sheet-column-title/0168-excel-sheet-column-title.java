class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        
        
        while(columnNumber > 0){
            columnNumber--;
            
            ans.append((char)(columnNumber%26 + 'A'));
            columnNumber /= 26;
        }
        
        // here we are reversing the string because while appening the new value our value 
        // insert at the end
        
        // example -> col -> 28 -> BA -> reverse -> AB 
        return ans.reverse().toString();
    }
}