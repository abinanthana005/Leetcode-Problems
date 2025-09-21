class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int x=1;x<num;x++)
        {
            if(num%x==0)
            sum=sum+x;
        }
        return sum==num;
    }
}