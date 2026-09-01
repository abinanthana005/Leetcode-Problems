class Solution {
    public String reversePrefix(String s, int k) {
        String str=new StringBuilder(s.substring(0,k)).reverse().toString();
        return str+s.substring(k);
    }
}