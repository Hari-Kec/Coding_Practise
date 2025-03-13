
class Solution {

    int minProduct(int arr[], int k) {
        Arrays.sort(arr);
        long prod=1;
        for(int i=0;i<k;i++){
            prod*=arr[i];
        }
        return prod;
             
    }
}

