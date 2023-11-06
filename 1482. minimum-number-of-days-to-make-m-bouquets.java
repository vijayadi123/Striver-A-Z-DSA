class Solution {
    public boolean check(int curr,int[] bloomday,int m,int k){
        int counter=0,noofbouquets=0;
        for(int num:bloomday){
            if(curr>=num){
                counter++;
            }else{
                noofbouquets+= (counter / k); 
                counter=0;
            }
        }
            noofbouquets+= (counter / k); 
            return noofbouquets >= m;
        }
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if( val > bloomDay.length) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:bloomDay){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,bloomDay,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}