class Solution {
    public boolean parseBoolExpr(String expression) {
       Stack<Character> rev = new Stack<>();

       for(char s:expression.toCharArray()){
        if(s==',' || s=='(') continue;
        if(s=='&' || s=='|' || s=='!' || s=='t' || s=='f') rev.push(s);
        else if(s==')'){
            boolean ht = false, hf = false;
            while(rev.peek()!='&' && rev.peek()!='!' && rev.peek()!='|'){
                char top = rev.pop();
                if(top=='t') ht = true;
                if(top=='f') hf = true;
            }
            char t = rev.pop();
            if(t=='!'){
                rev.push(ht?'f':'t');
            }
            else if(t=='&') rev.push(hf?'f':'t');
            else rev.push(ht?'t':'f');
        }
       } 
       return rev.peek()=='t';
    }
}