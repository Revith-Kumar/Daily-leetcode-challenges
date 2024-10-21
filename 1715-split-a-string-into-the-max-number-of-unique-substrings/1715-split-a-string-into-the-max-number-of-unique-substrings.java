import java.util.HashSet;

class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s, new HashSet<>(), 0);
    }

    private int backtrack(String s, HashSet<String> rev, int start) {
        if(start==s.length()) return 0;
        int maxcount =0;
        String str = "";
        for(int i=start;i<s.length();i++){
            str+= s.charAt(i);
            if(!rev.contains(str)){
                rev.add(str);
                int count = 1+backtrack(s,rev,i+1);
                maxcount=Math.max(count,maxcount);
                rev.remove(str);
            }
       }
         return maxcount;
}
}
