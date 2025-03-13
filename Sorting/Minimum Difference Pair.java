class Solution {
    public int minimumDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
        }
        return mindiff;
    }
}