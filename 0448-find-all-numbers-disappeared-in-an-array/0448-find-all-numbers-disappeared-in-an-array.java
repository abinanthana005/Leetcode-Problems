class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> result=new ArrayList<>();
        for(int val:nums)
        set.add(val);
        for(int n=1; n<= nums.length; n++){
            if(!set.contains(n)){
                result.add(n);
            }
        } 
        return result;
    }
}