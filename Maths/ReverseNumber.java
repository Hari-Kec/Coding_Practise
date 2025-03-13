class Solution {
    public int reverseDigits(int n) {
        int remainder;
        int res=0;
        int temp=n;
        while(temp!=0){
            remainder=temp%10;
            res=res*10+remainder;
            temp/=10;
        }
        return res;
    }
}