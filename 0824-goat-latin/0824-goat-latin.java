class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.indexOf(word.charAt(0)) != -1) {
                res.append(word);
            } else {
                res.append(word.substring(1)).append(word.charAt(0));
            }
            res.append("ma");
            for (int j = 0; j <= i; j++) res.append('a');
            if (i < words.length - 1) res.append(" ");
        }

        return res.toString();
    }
}
