class Solution {
    public int finalsearch(int[] nums,int target,int low,int high){
        if(low>=high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return finalsearch(nums,target,low,mid);
        }
        else{
            return finalsearch(nums,target,mid+1,high);
        }
    }
    public int search(int[] nums, int target) {
        return finalsearch(nums,target,0,nums.length);
    }
}