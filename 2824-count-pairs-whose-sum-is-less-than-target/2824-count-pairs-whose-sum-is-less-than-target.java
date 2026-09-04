class Solution {
    public int countPairs(List<Integer> nums, int target) {
      Collections.sort(nums);
      int count=0;
      int left=0;
      int right=nums.size()-1;
      while(left<right){
        int current=nums.get(left)+nums.get(right);
        if(current<target){
            count+=(right-left);
            left++;
        }else{
            right--;
        }
      }
      return count;
    }
}