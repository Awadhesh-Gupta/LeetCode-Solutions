class Solution {
    public int strStr(String haystack, String needle) {
        /* Using Built in functions
    if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
        */
        /* Brute approach:
        for(int i =0;i<haystack.length();i++){
            int c =0;
            if(haystack.charAt(i) == needle.charAt(c)){
                int m = c;
                int j;
                for(j =i+1;j<needle.length();j++){
                    if(haystack.charAt(j) != needle.charAt(++c)){
                    }
                }
                if(j == needle.length()) return m;
            }
        }
        return -1;
        */

        //optimized using KMP approach i.e. using a prefix table (LPS array)
        if (needle.length() == 0) return 0;

        int[] lps = buildLPS(needle);
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == needle.length()) {
                return i - j;
            }
            else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }


}