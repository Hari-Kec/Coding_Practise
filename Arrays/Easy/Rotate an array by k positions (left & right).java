class Main{
    public static void main(int arr[],int n,int k){
        //RIGHT 
        int mod=k%n; 
        for(int i=0;i<n;i++){
            if(i<mod){
                System.out.println(arr[n+i-mod]);
            }
            else{
                System.out.println(arr[i-mod]);
            }
        }

        //LEFT
        int mod=k%n;
        System.out.print(arr[(i + mod) % n] + " ");
        }


    }
}