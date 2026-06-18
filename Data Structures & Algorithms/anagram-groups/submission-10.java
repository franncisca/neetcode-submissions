class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Map<int[], List<String>> map = new HashMap<>();
        //int[] can't be used as a key because java compare arrays by reference not content.
        //Strings compare by content, has reliable hashcode and is immutable.

        //Content compare:
        //int[] a = {1,2,3};
        //int[] b = {1,2,3};
        //System.out.println(a.equals(b));          // false
        //System.out.println(Arrays.equals(a,b));   // true

        HashMap<String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(str);
        }

        return new ArrayList<>(res.values());
    }
}
