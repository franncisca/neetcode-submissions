class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> temp = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (temp.contains(s.charAt(j))) {
                    break;
                }
                temp.add(s.charAt(j));
            }

            res = Math.max(res, temp.size());
        }

        return res;
        
    }
}
