class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitalsum=0;
        for(int num:nums){
            elementsum+=num;
            int temp=num;
            while(temp>0){
             digitalsum+=temp%10;
             temp/=10;
            }
        }
        return elementsum-digitalsum;
    }
}