class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> rev= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!(rev.add(nums[i]))) return true; 
        }
        return false;
    }
}