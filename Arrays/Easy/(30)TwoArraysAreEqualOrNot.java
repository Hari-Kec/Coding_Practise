class Main{
    public static void main(int arr1[],int arr2[]){
        boolean result=true;
        if(arr1.length == b.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    result=false;
                    break;
                }
            }
        }
        else{
            result=false;
        }
        if(result){
            SOP(true);
        }
        else{
            SOP(false);
        }
    }
}

OR 

class Main{
    public static void main(int arr1[],int arr2[]){
        boolean result=Arrays.equals(arr1,arr2);
        if(result){
            SOP(true);
        }
        else{
            SOP(false);
        }
    }
}

