import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int rem = (int)(total%p);
        if(rem==0) return 0;
        HashMap<Integer,Integer> rev = new HashMap<>();
        rev.put(0,-1);
        long psum = 0;
        int mlength=nums.length;
        for(int i=0;i<nums.length;i++){
           psum= psum+nums[i];
           int current = (int)(psum%p);
           int target = (current-rem+p)%p;
           if(rev.containsKey(target)){
            mlength = Math.min(mlength,i-rev.get(target));
           } 
           rev.put(current,i);
        }
        return mlength==nums.length?-1:mlength;
    }
}