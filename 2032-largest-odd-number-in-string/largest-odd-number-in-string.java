class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            // System.out.println((int)num.charAt(i)%2);
            if(num.charAt(i)%2==1)
            {
                return num.substring(0,i+1);
            }
        }
        return new String("");
    }
}

// class Solution {
//     public String largestOddNumber(String num) {
//         int maxOddIndex = -1;

//         for (int i = 0; i < num.length(); i++) {
//             char currentChar = num.charAt(i);
//             if ((currentChar - '0') % 2 != 0) {
//                 maxOddIndex = i;
//             }
//         }

//         if (maxOddIndex == -1) {
//             return ""; // No odd number found
//         } else {
//             return num.substring(0, maxOddIndex + 1);
//         }
//     }
// }
