class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Review 3
        //Solution with sort
        Map<String, List<String>> res = new HashMap<>();

        if (strs.length == 0) {
            return new ArrayList<>();
        }

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            //we can't use charArray.toString() here because the array will be changed 
            //we should use new String to create new string
            String sortedStr = new String(charArray);

            System.out.println("sortedStr: " + sortedStr);

            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(str);
        }

        return new ArrayList<>(res.values());
    } 
}
