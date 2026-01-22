class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1; // start with 1 line
        int currentWidth = 0;

        for (char c : S.toCharArray()) {
            int w = widths[c - 'a'];
            if (currentWidth + w > 100) {
                lines++;
                currentWidth = w;
            } else {
                currentWidth += w;
            }
        }

        return new int[]{lines, currentWidth};
    }
}
