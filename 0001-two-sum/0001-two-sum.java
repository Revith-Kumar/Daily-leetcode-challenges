class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> rev = new HashMap();
       for(int i=0;i<nums.length;i++){
         int com = target - nums[i];
         if(rev.containsKey(com)){
             return new int[]{rev.get(com),i};
         }
         rev.put(nums[i],i);
       }
       return null;
    }
}