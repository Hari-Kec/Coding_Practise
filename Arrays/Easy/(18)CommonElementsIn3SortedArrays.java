class Main{
    public static void main(int arr1[],int arr2[],int arr3[]){
        int a=arr1.length;
        int b=arr2.length;
        int c=arr3.length;
        int i=0,j=0,k=0;
        while(i<a && j<b && k<c){
            if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
                return arr1[i];
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }

    }
}