class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> rev = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(rev.isEmpty() && s.charAt(i)==')') count++;
            else if(s.charAt(i)==')'){
               rev.pop();
            }
            else rev.push(s.charAt(i));
        }
        return count+rev.size();
    }
}