import java.util.HashSet;

class Solution {
    public int maxUniqueSplit(String s) {
        // Use HashSet instead of ArrayList for faster lookup of unique substrings
        return split(s, new HashSet<>(), 0);
    }

    private int split(String s, HashSet<String> used, int start) {
        // If we've reached the end of the string, no further split is possible
        if (start == s.length()) {
            return 0;
        }

        int maxCount = 0;
        String currentSubstr = "";

        // Explore substrings starting from 'start'
        for (int i = start; i < s.length(); i++) {
            currentSubstr += s.charAt(i);

            // If this substring hasn't been used before
            if (!used.contains(currentSubstr)) {
                used.add(currentSubstr);  // Mark substring as used
                // Recursively split the rest of the string and count unique splits
                int count = 1 + split(s, used, i + 1);
                maxCount = Math.max(maxCount, count);  // Update max count of unique splits
                used.remove(currentSubstr);  // Backtrack by removing substring from set
            }
        }

        return maxCount;
    }
}
