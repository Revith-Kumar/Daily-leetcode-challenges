import java.util.Arrays;

class Solution {
    // Helper method to find the length of the common prefix between two strings
    private int commonPrefixLength(String e1, String e2) {
        int minLength = Math.min(e1.length(), e2.length());
        int ci = 0;
        // Find common prefix length
        while (ci < minLength && e1.charAt(ci) == e2.charAt(ci)) {
            ci++;
        }
        return ci;
    }
    
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Convert both integer arrays to string arrays
        String[] first = Arrays.stream(arr1).mapToObj(String::valueOf).toArray(String[]::new);
        String[] second = Arrays.stream(arr2).mapToObj(String::valueOf).toArray(String[]::new);

        // Sort both arrays to reduce unnecessary comparisons
        Arrays.sort(first);
        Arrays.sort(second);
        
        int max = 0;
        int i = 0, j = 0;

        // Use two pointers to compare the arrays after sorting
        while (i < first.length && j < second.length) {
            String e1 = first[i];
            String e2 = second[j];

            // Calculate the common prefix length
            int commonPrefix = commonPrefixLength(e1, e2);
            max = Math.max(max, commonPrefix);

            // Move the pointers forward based on lexicographical comparison
            if (e1.compareTo(e2) < 0) {
                i++;
            } else if (e1.compareTo(e2) > 0) {
                j++;
            } else {
                // If the elements are equal, move both pointers
                i++;
                j++;
            }
        }
        
        return max;
    }
}
