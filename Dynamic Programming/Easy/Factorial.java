class Main{
    public static void main(int N){
        int res=1;
        for(int i=2;i<=N;i++){
            res*=i;
        }
        return res;
    }
}