class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int n=arr.size();
        if(k>n) return;
        int left=k-1;
        int right=n-k;
        int temp=arr.get(left);
        arr.set(left,arr.get(right));
        arr.set(right,temp);
    }
}