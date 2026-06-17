class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Review1 
        //Solution of hash table (array)
        Map<String, List<String>> res = new HashMap<>();
        //str.toCharArray()
        //Arrays.sort(charArray)
        //Arrays.toString(count)

        for (String str : strs) {
            int[] counter = new int[26];
            for (char c : str.toCharArray()) {
                counter[c - 'a'] ++;
            }

            String key = Arrays.toString(counter);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }

        return new ArrayList<>(res.values());
        
    }
}
