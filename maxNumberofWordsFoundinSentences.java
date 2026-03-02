class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int spaceCount = 0;

            for (char ch : sentence.toCharArray()) {
                if (ch == ' ') {
                    spaceCount++;
                }
            }

            int words = spaceCount + 1;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}