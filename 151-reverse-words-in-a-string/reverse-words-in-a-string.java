class Solution {



public void reverse(String[] rev){
    int l=0;
    int r=rev.length-1;
    while(l<r){
        String temp=rev[r];
        rev[r]=rev[l];
        rev[l]=temp;
        l++;
        r--;
    }

} 

    public String reverseWords(String s) {
        s=s.trim();
        String []rev=s.split("\\s+");
        
        reverse(rev);

        return String.join(" ",rev);



    }
}