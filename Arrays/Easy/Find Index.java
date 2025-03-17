class Solution {
    static int[] findIndex(int arr[], int key) {
        int n = arr.length;
        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                if (first == -1) first = i; 
                last = i; 
            }
        }

        return new int[]{first, last};
    }
}
