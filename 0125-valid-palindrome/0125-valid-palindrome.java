class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          if(Character.isLetterOrDigit(c)){
            str+=c;
          }
        }
        str=str.toLowerCase();
        int n = str.length();
        for(int i=0;i<n/2;i++){
          if(str.charAt(i)!=str.charAt(n-1-i)) return false; 
        }
        return true;
    }
}