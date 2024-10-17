class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;

        // Record the last position of each digit (0-9)
        int[] lastIndex = new int[10];
        for (int i = 0; i < n; i++) {
            lastIndex[arr[i] - '0'] = i;
        }

        // Try to find the first place to swap
        for (int i = 0; i < n; i++) {
            // Check digits larger than arr[i]
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (lastIndex[d] > i) {
                    // Swap the digits
                    char temp = arr[i];
                    arr[i] = arr[lastIndex[d]];
                    arr[lastIndex[d]] = temp;

                    // Return the result after swap
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num; // Return the original number if no swap was made
    }
}
