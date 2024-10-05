import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n > m) return false; // If s1 is longer than s2, s1 cannot be a substring of s2

        // Frequency arrays to store counts of characters 'a' to 'z'
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        
        // Fill the frequency array for s1
        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++; // Fill the first window of size n in s2
        }

        // Compare the two frequency arrays for the first window
        if (Arrays.equals(s1Count, windowCount)) return true;

        // Slide the window across s2
        for (int i = n; i < m; i++) {
            // Add new character to the window
            windowCount[s2.charAt(i) - 'a']++;
            // Remove the character that goes out of the window
            windowCount[s2.charAt(i - n) - 'a']--;

            // Compare the frequency arrays
            if (Arrays.equals(s1Count, windowCount)) return true;
        }

        return false;
    }
}
