class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String s3 = s + s;

        if (s3.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}
