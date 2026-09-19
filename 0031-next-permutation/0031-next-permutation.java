class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        rev(nums,index+1,nums.length-1);
    }
        //writing funcction for reverve the arr
        private void rev(int[] arr,int start, int end){
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        //swaping
        private void swap(int[] arr,int i,int j){
            int temp=arr[i];
             arr[i]=arr[j];
            arr[j]=temp;
            return;
        }  
}