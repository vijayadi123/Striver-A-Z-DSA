class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(o1,o2)->o1[0]-o2[0]);
        ArrayList<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()- 1)[1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else {
                    break;
                }
            }
            ans.add(new int[]{start,end});
        }
            int arr[][]=new int[ans.size()][];

            return ans.toArray(new int[0][]);
        }
    }
