Given an array arr[] of positive integers. Your task is to sort them so that the first part of the array contains odd numbers sorted in descending order, and the rest of the portion contains even numbers sorted in ascending order.
Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
Output: [7, 5, 3, 1, 2, 4, 10]
Explanation: 7 5 3 1 are odds in descending order and 2 4 10 are evens in ascending order.

class Solution {
    public void sortIt(Long arr[]) {
        List<Long> odd = new ArrayList<>();
        List<Long> even = new ArrayList<>();

        for (Long num : arr) {
            if (num % 2 != 0) odd.add(num);
            else even.add(num);
        }

        odd.sort(Collections.reverseOrder());
        Collections.sort(even);

        int index = 0;
        for (Long num : odd) arr[index++] = num;
        for (Long num : even) arr[index++] = num;
    }
}