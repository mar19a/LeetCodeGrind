class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int vowelsCount = 0;

        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                vowelsCount++;
            }
        }

        maxVowels = vowelsCount;

        for(int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i - k))) {
                vowelsCount--;
            }

            if(isVowel(s.charAt(i))) {
                vowelsCount++;
            }

            maxVowels = Math.max(maxVowels, vowelsCount);
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}