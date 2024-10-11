class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int max=Integer.MIN_VALUE;
        while(start<end){
           int curr=Math.min(height[start],height[end])*(end-start);
           max=Math.max(curr,max);
           if(height[start]<height[end]) start++;
           else end--;
        }
        return max;
    }
}