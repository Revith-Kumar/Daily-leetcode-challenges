class Solution {
    public String rev(String s){
       StringBuilder re = new StringBuilder();
       for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='0') re.append('1');
          else re.append('0');
       }
       re.reverse();
       return re.toString();
    }
    public char findKthBit(int n, int k) {
        String s ="0";
        for(int i=1;i<n;i++){
            s=s+'1'+rev(s);
        }
        return s.charAt(k-1);
    }
}