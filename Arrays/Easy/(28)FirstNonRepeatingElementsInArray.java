class Main{
    public static void main(int arr[]){
        Hashmap<Integer,Integer> map = new Hashmap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}