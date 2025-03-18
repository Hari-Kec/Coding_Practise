class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int small_count=0;
        int large_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                small_count++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>=target){
                large_count++;
            }
        }
        return new int[]{small_count , large_count};
        
    }
}