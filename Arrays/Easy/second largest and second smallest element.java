class Main {
    //Second Largest
    static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        for(int i=n-2;i>0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    //Second Smallest
    static int getSecondSmallest(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
