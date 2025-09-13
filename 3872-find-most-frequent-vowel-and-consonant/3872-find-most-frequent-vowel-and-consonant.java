class Solution {
    public int maxFreqSum(String s) {
     int c=0,v=0;
     Map<Character,Integer> con = new HashMap<>();
     Map<Character,Integer> vow= new HashMap<>();
     for(char ch:s.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vow.put(ch,vow.getOrDefault(ch,0)+1);
        else con.put(ch,con.getOrDefault(ch,0)+1);
     }
     if (!con.isEmpty()) {
            c = Collections.max(con.values());
        }
        if (!vow.isEmpty()) {
            v = Collections.max(vow.values());
        }
     return c+v;
    }
}