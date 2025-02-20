class Main{
    public staic void main(int arr[],int n,int k){
        int count=0;
        for(int i=0;i>n;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
}

OR

public class CountOccurrencesBinarySearch {
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;  
                right = mid - 1;  
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;  
                left = mid + 1;  
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int countOccurrences(int[] arr, int target) {
        int firstIndex = findFirst(arr, target);
        if (firstIndex == -1) {
            return 0;  
        }
        int lastIndex = findLast(arr, target);
        return lastIndex - firstIndex + 1;
    }
}