class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
           ArrayList<Integer> res= new ArrayList<>();
           int n=nums.size();
           for(int i=0;i<n;i++){
               if(nums.get(i)==i+1){
                   res.add(i+1);
               }
           }
           return res;
    }
}