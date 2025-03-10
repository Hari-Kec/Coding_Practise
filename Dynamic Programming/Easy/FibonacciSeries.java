class Main{
    public static void Fibonocci(int N){
        int num1=0,num2=1;
        for(int i=0;i<N;i++){
            System.out.print(num1+" ");
            int sum=num1+num2;
            num1=num2;
            num2=sum;
        }
    }
}

OR
//RECURSION

import java.io.*;
class GFG {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String args[])
    {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
