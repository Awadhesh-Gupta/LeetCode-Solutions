class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] freq = new int[26];

            // count characters
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // build key
            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append(count).append('#');
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}


        /*
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    */