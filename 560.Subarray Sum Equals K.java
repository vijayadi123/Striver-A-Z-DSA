class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0,cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int remove=presum-k;
            cnt+=mp.getOrDefault(remove,0);
            mp.put(presum,mp.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}