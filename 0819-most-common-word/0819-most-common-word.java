import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) bannedSet.add(word.toLowerCase());

        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        String result = "";
        int maxCount = 0;
        for (String word : count.keySet()) {
            if (count.get(word) > maxCount) {
                maxCount = count.get(word);
                result = word;
            }
        }

        return result;
    }
}
