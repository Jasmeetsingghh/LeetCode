public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        // Split the input string into an array of words
        String[] words = s.split("\\s+");
        
        reverseArray(words);
        
        return String.join(" ", words);
    }
    
    private void reverseArray(String[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
