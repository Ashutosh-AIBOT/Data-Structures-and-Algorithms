class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.indexOf(needle) ;
     if ( m >= 0 ){
        return  m ;
     }
     else {
        return -1 ;
     }
        
    }
}