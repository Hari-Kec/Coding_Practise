class Solution {
    boolean isDigitSumPalindrome(int n) {
        int temp = n, sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int originalSum = sum, reversedSum = 0;
        while (sum != 0) {
            reversedSum = reversedSum * 10 + sum % 10;
            sum /= 10;
        }
        return originalSum == reversedSum;
    }
}
