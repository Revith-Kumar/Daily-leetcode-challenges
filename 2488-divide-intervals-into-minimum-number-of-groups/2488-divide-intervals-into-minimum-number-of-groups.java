class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];
       
       for(int i=0;i<n;i++){
        start[i]=intervals[i][0];
        end[i]=intervals[i][1];
       }
       Arrays.sort(start);
       Arrays.sort(end);
       int ep=0, count=0;
       for(int s:start){
        if(s>end[ep]) ep++;
        else count++;
       }
       return count;
    }
}