class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str=str+s.charAt(i);
            }
            System.out.println(s.charAt(i));
        }
        String m="";
        for(int i=0;i<str.length();i++){
            m+=Character.toLowerCase(str.charAt(i));
        }
        //System.out.println(str);
        int l=0,r=m.length()-1;
        while(l<r){
            if(m.charAt(l)!=m.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}