class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        
        for (String word : words) {
            int len = word.length();
            int index = word.charAt(len - 1) - '1';
            ans[index] = word.substring(0, len - 1);
        }
        
        return String.join(" ", ans);
    }
}
