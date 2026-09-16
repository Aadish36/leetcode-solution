class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int PI=0,NI=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[NI]=nums[i];
                NI+=2;
            }
            else{
                ans[PI]=nums[i];
                PI+=2;
            }
        }
        return ans;
    }
}