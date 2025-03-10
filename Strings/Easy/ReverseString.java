class Main{
    public static void main(String[] args){
        String s= "hello";
        String r="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            r=ch+r;
        }
        System.out.println(r);
    }
}

OR 

class Main{
    public static void main(String[] args){
        String s="hello";
        StringBuilder res= new StringBuilder();
        res.append(s);
        res.reverse();
        System.out.println(res);
    }
}