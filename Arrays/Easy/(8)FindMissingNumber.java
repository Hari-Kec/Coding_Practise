class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(arr[0]!=0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                return arr[i]+1;
            }
        }
        return arr.length;
    }
}