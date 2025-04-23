class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int i = 0; 
        int j = 0 ;
        while (i < len1 && j < len2 ) {
           if (s.charAt(i) == t.charAt(j)) {
              i++ ;
            }       
         j++; 

        }

        return i == len1;
    }
}