class Solution {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n-1;

        int indx = 0;


        while(indx <= right){
            if(nums[indx] == 0){
                swap(nums, indx, left);
                indx++;
                left++;
            }
            else if(nums[indx] == 2){
                swap(nums, indx, right);
                right--;
                // but we don't need to to update the index
            }
            else indx++;
        }
    }
}