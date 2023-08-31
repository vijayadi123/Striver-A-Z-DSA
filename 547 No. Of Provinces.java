class Solution {
    private static void dfs(int i,int[][] isConnected,int[] vis){
        if(vis[i]==1){
            return;
        }
        vis[i]=1;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1){
                dfs(j,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
       int vis[]=new int[isConnected.length];
       int count=0;
       for(int i=0;i<isConnected.length;i++){
           if(vis[i]==0){
               dfs(i,isConnected,vis);
               count++;
           }
       }
       return count;
    }
}