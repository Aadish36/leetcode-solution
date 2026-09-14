class Solution {
    public int[] sortedSquares(int[] nums) {
       int   left=0;
      int  right=nums.length-1;
       int  pos =nums.length-1;
       int[] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                ans[pos]=nums[left]*nums[left];
                left++;
            }
            else{
                ans[pos]=nums[right]*nums[right];
                right--;
            }
            pos--;
            
        }
        return ans;
        }
    
}