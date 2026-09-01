class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            int res=count+1;
            max=Math.max(max,res);

        }
        return max;
    }
}