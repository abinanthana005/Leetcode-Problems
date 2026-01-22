class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] res = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') {
                res[i] = low++;
            } else {
                res[i] = high--;
            }
        }
        res[n] = low; 
        return res;
    }
}
