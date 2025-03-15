class Solution {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(arr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int original = num, reversed = 0, rem;
        while (num > 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        return original == reversed;
    }
        
    
}