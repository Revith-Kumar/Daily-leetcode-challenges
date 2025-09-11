class Solution {
    public String sortVowels(String s) {
        char[] ch = s.toCharArray();
        StringBuilder rev = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e' || ch           [i]=='i' || ch[i]=='o' || ch[i]=='u'){
                rev.append(ch[i]);
                ch[i]='#';
            }
        }
        char[] ah = rev.toString().toCharArray();
        Arrays.sort(ah);
        String a = new String(ah);
        int j=0;
        for(int i=0;i<s.length();i++){
           if(ch[i]=='#'){
            ch[i]=a.charAt(j);
            j++;
           }
        }
        return new String(ch);
    }
}