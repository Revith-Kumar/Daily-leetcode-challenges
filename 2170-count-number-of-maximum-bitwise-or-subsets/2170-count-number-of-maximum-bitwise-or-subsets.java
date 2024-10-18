class Solution {
    public void backtrack(int[] nums,int index,int cur,int max,int[] count){
        if(cur==max) count[0]++;
        for(int i=index;i<nums.length;i++){
            backtrack(nums,i+1,cur|nums[i],max,count);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int num:nums){
            max|=num;
        }
        int[] count = new int[1];
        backtrack(nums,0,0,max,count);
        return count[0];
    }
}