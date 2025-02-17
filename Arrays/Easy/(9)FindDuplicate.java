class Main {
    static List<Integer> findDuplicate(int[] arr) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(arr[i]==arr[j]&& !res.contains(arr[i])){
                    res.add(arr[i]);
                    break;
                }
            }
        }
        return res;
    }
}