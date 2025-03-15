class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> res= new ArrayList<>();
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(right>=left) res.add(arr[right--]);
            if(left<=right) res.add(arr[left++]);
        }
        return res;
        
    }
}
