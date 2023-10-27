class Solution {
    public static int findtime(int[] piles,int i){
        int time=0;
        for(int m=0;m<piles.length;m++){
            time += Math.ceil((double)piles[m] / i);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;;
        int reqtime=0,i;
        for(int j=0;j<piles.length;j++){
            max = Math.max(max, piles[j]);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            reqtime=findtime(piles,mid);
            if(reqtime<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}