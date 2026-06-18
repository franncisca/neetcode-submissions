class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Review2
        //Solution with Hashtap, still thing we can use hashmap to get the key
        //I forget that we can sort the string
        //Not very smooth of res.putIfAbsent(key, new ArraysList<>()) and res.get(key).add(str)
        //But I made it
        //res.putIfAbsent(key, new ArraysList<>())  but I wrote putIfPresent()
        //Time: O()
        //Space: O()

        Map<String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            int[] counter = new int[26];
            for (int i = 0; i < str.length(); i++) {
                counter[str.charAt(i) - 'a']++;
            }
            
            String key = Arrays.toString(counter);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }

        return new ArrayList<>(res.values());

    }
}
