class Solution { 
    public boolean divisor(int mid,int[] nums,int threshold){
        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double)num/(double)mid);
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(divisor(mid,nums,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}