class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int i = 0; 

        while (i < len) {  
            boolean isUni = true;

            for (int j = 0; j < len; j++) {
                if (i != j && chars[i] == chars[j]) {
                    isUni = false;
                    break;
                }
            }

            if (isUni) {
                return i;
            }

            i++;
        }

        return -1; 
    }
}

