class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Review2
        //Solution with Hashtap, still thing we can use hashmap to get the key
        //I forget that we can sort the string
        //Not very smooth of res.putIfAbsent(key, new ArraysList<>()) and res.get(key).add(str)
        //But I made it
        //res.putIfAbsent(key, new ArraysList<>())  but I wrote putIfPresent()
        //Still need to review toCharArray() is a method of String 
        //Still need to review Arrays.sort() will change the original array
        //Time: O(m * n)
        //Space: O(m * n)
        //I even learned the counter solution of all the characters not just a-z but A-Z and all

        Map<String, List<String>> res = new HashMap<>();

        /*
        for (String str : strs) {
            int[] counter = new int[26];
            for (int i = 0; i < str.length(); i++) {
                counter[str.charAt(i) - 'a']++;
            }
            
            String key = Arrays.toString(counter);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        */

        //Solution with Arrays.sort()
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(str);
        }

        return new ArrayList<>(res.values());

    }
}
