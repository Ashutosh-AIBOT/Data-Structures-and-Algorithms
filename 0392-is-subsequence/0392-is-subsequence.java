class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
       char[] ss = s.toCharArray();
       char[] tt = t.toCharArray();
       
        int i = 0; 
        int j = 0 ;
        while (i < len1 && j < len2 ) {
           if(ss[i] == tt[j]){
              i++ ;
            }       
         j++; 

        }

        return i == len1;
    }
}