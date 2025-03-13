class Solution {
    static boolean armstrongNumber(int n) {
        int remainder , result=0;
        int original=n;
        while(original!=0){
            remainder=original%10;
            result+=Math.pow(remainder,3);
            original/=10;
        }
        if(result==n){
            return true;
        }
        else{
            return false;
        }
        
    }
}