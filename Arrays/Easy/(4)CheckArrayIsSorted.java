class main{
    public static void main(int arr[]){
        if(arr.length==0||arr.length==1){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}