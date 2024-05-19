
class Solution {
    // Normalizes a string by mapping each unique character to a consecutive letter starting from 'a'
    private String createUpdateMapping(String str) {
        if (str.isEmpty()) return ""; // Handle empty string case
        
        char start = 'a';
        char[] mapping = new char[300];

        // Find mapping
        for (char ch : str.toCharArray()) {
            if (mapping[ch] == 0) {
                mapping[ch] = start;
                start++;
            }
        }

        // Update the string
        StringBuilder normalizedString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            normalizedString.append(mapping[ch]);
        }

        return normalizedString.toString();
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        // Normalize the pattern
        String normalizedPattern = createUpdateMapping(pattern);
        
        // Iterate through each word
        for (String word : words) {
            String normalizedWord = createUpdateMapping(word);         
            // Normalize the word
            if (normalizedWord.equals(normalizedPattern)) {
                // If the normalized word matches the normalized pattern, add it to the result
                ans.add(word);
            }
        }
        return ans;
    }
}
