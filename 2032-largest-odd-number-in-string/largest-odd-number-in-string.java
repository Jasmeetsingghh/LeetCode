class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            // System.out.println((int)num.charAt(i)%2);
            if((int)num.charAt(i)%2==1)
            {
                return num.substring(0,i+1);
            }
        }
        return new String("");
    }
}