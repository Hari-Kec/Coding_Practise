class Main{
    public static void main(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            if(arr[i]==0){
                return true;
            }
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
        
    }
}