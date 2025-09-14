class Solution {
    public int romanToInt(String s) {
        // Map Roman numerals to values
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = values[s.charAt(i) - 'A'];

            // If next value is larger, subtract current
            if (i + 1 < s.length()) {
                int next = values[s.charAt(i + 1) - 'A'];
                if (curr < next) {
                    result -= curr;
                    continue;
                }
            }
            result += curr;
        }
        return result;
    }
}