class Solution {
    public int maxFreqSum(String s) {
        int[] vowels = new int[26];
        int[] consonants = new int[26];
        
        int maxVowelCount = 0;
        int maxConsonantCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels[c - 'a']++;
                if (vowels[c - 'a'] > maxVowelCount) {
                    maxVowelCount = vowels[c - 'a'];
                }
            } else {
                consonants[c - 'a']++;
                if (consonants[c - 'a'] > maxConsonantCount) {
                    maxConsonantCount = consonants[c - 'a'];
                }
            }
        }
        
        return maxVowelCount + maxConsonantCount;
    }
}
