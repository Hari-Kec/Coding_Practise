class Main{
    public static void main(int arr[],int n,int sum){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
}

OR 

class Main{
    public static void main(int arr[],int n,int sum){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        for(int num: mp){
            int complement=sum-num;
            if(mp.containsKey(complenment)){
                count+=mp.get(complement);

            }
            else{
                freq.put(num,freq.getOrDefault(num,0)+1);
            }
        }
    }
}