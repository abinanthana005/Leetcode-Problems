class Solution {
    public int reverseDegree(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int pos=i+1;
            int rev='z'- ch+1;
            total+=pos*rev;
        }
        return total;
    }
}