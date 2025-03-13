Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1 , 2, 5 and we leave two greatest elements 7 & 8. 


class Solution {
    public long[] findElements(long arr[]) {
         Arrays.sort(arr);
         return Arrays.copyOfRange(arr,0,arr.length-2);
            
    }
}