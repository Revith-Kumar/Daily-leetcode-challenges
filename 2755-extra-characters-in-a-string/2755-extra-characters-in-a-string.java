class Solution {
    public int minExtraChar(String s, String[] ss) {
        int n = s.length();
        Set<String> rev = new HashSet<>();
        for(String str :ss){
            rev.add(str);
        }
        int dp[]= new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=n;
        }
        dp[0]=0;
        for(int i=1;i<=n;i++){
          for(int j=0;j<i;j++){
            String sub =s.substring(j,i); 
            if(rev.contains(sub)) {
                dp[i]=Math.min(dp[i],dp[j]);
            }
          }
          dp[i]=Math.min(dp[i],dp[i-1]+1);
        }
        return dp[n];
    }
}