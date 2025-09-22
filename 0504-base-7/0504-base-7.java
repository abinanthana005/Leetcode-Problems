class Solution {
    public String convertToBase7(int num) {
        String res="";
        int rem,copyNum=num;
        num=Math.abs(num);
        if(num==0)
        return"0";
        while(num!=0)
        {
            rem=num%7;
            res=rem+res;
            num=num/7;
        }
        if(copyNum<0)
        return"-"+res;
        else
        return res;
            }
}