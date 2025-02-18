class Main{
    public static void main(int arr[],int size){
        int maxDiff=arr[1]-arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>maxDiff){
                    maxDiff=arr[j]-arr[i];
                }
            }
        }
        return maxDiff;
    }
}