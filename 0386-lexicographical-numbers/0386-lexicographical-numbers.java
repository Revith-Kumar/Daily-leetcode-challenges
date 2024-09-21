class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> rev = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int curr = 1;
        for(int i=1;i<=n;i++){
            String s = Integer.toString(i);
            rev.add(s);
        }
        Collections.sort(rev);
          for(int i=0;i<n;i++){
            int ns = Integer.parseInt(rev.get(i));
            ar.add(ns);
        }
        return ar;
    }
}