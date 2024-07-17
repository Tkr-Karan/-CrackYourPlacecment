public class Solution {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int left = 0;
        int right = n-1;
        
        int index = 0;
        
        while(index <= right){
            if(nums[index] == 0){
                swap(nums, index, left);
                index++;
                left++;
            }else if(nums[index] == 2){
                swap(nums, index, right);
                right--;
            }else{
                index++;
            }
        }
    }
}
