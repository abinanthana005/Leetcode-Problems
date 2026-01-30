class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] temp = freq.clone();
            boolean good = true;

            for (char c : word.toCharArray()) {
                if (--temp[c - 'a'] < 0) {
                    good = false;
                    break;
                }
            }

            if (good) sum += word.length();
        }

        return sum;
    }
}
