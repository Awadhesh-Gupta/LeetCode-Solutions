class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*int n = strs.length;
        int minlength = Integer.MAX_VALUE;
        for (String str : strs) {
            minlength = Math.min(minlength, str.length());
        }
        StringBuilder prefix = new StringBuilder();
        for (int k = 0; k < minlength; k++) {
            char current = strs[0].charAt(k);

            for (int i = 1; i < n; i++) {
                if (strs[i].charAt(k) != current) {
                    return prefix.toString();
                }
            }
            prefix.append(current);
        }
        return prefix.toString();

        */
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}