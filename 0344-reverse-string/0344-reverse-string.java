class Solution {
    public void reverseString(char[] s) {
        //char ch=' ';
        int n=s.length;
        int i=0;
        while(i<(n/2)){
            char str=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=str;
            i++;
        }
    }
}