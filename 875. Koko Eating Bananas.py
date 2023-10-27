class Solution:
    def findtime(piles,hourly):
        time=0
        for i in range(len(piles)):
            time+=math.ceil(piles[i]/hourly)
        return time
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        maxi=max(piles)
        low=1
        high=maxi
        while low<=high:
            mid=(low+high)//2
            calctime=Solution.findtime(piles,mid)
            if calctime<=h:
                high=mid-1
            else:
                low=mid+1
        return low