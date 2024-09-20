class Solution {
    public boolean palindrome(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        if(str.equals(s)) return true;
        return false;
    }
    public String shortestPalindrome(String s) {
       if (palindrome(s)) return s;
        StringBuilder st = new StringBuilder(s).reverse();
        String rev = st.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0, s.length() - i).equals(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }
        
        return s;
    }
}