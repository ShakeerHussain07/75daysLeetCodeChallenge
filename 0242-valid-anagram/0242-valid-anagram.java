class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        int a[] =new int[26];
        int k=0;
        for(int i=0;i<m;i++){
            a[s.charAt(k++)-97]++;
        }
        int [] b=new int[26];
        k=0;
        for(int i=0;i<m;i++){
            b[t.charAt(k++)-97]++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}