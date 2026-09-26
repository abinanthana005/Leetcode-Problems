class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[128];
        map[' '] = ' '; 
        char curr = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (map[c] == 0) {
                map[c] = curr++;
            }
        }
        char[] ans = message.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map[ans[i]];
        }
        return String.valueOf(ans);
    }
}
