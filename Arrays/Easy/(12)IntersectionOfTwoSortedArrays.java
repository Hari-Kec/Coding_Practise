class Main{
    static ArrayList<Integer> FindIntersection(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int visited[] =  new int[m.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j] && visited[j]==0 ){
                    ans.add(arr2[j]);
                    visited[j]==1;
                    break;
                }
                else if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return ans;
    }
}