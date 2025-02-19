class Main{
    public static void main(int arr[],int n){
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.contains(arr[i])){
                mp.put(arr[i],arr[i]+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
    }
}