class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Review1 with help
        //Solution with sort
        //Time: O(m * nlongn)
        //Space O(m * n)

        Map<String, List<String>> results = new HashMap<>();

        for (String str : strs) {
            //String is immutable so can't sort a String dirctly
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            results.putIfAbsent(sortedStr, new ArrayList<>());
            results.get(sortedStr).add(str);
        }

        return new ArrayList<>(results.values());
    }
}
