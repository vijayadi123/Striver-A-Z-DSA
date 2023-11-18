class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                last=mid;
                while(first >0 && nums[first-1]==target){
                    first--;
                }
                while(last <nums.length-1 && nums[last+1]==target){
                    last++;
                }
                break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return new int[]{first,last};
    }
}