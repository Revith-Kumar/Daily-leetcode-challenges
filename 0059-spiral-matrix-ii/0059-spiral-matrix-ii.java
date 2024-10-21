class Solution {
    public int[][] generateMatrix(int n) {
       int top = 0, left =0, bottom = n-1,right = n-1,value=1;
       int[][] arr = new int[n][n];
       while(value<=n*n){
        for(int i=left;i<=right;i++) arr[top][i]=value++;
        top++;
        for(int i=top;i<=bottom;i++) arr[i][right]=value++;
        right--;
        for(int i=right;i>=left;i--) arr[bottom][i] = value++;
        bottom--;
        for(int i=bottom;i>=top;i--) arr[i][left]=value++;
        left++;
       }
       return arr; 
    }
}