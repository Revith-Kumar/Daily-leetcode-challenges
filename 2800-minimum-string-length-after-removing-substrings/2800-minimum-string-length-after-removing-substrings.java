class Solution {
    public int minLength(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String pair = s.substring(i, i + 2);
            if (pair.equals("AB") || pair.equals("CD")) {
                return minLength(s.substring(0, i) + s.substring(i + 2));
            }
        }
        return s.length();
    }
}
