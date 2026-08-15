class Solution {
    public int missingNumber(int[] nums) {
        int currentsum=0;
        int n=nums.length;
         int expectedsum=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            currentsum+=nums[i];
        }
        int missingnum=expectedsum-currentsum;
        return missingnum;
        
    }
}