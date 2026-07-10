class Solution {
    public int lengthOfLongestSubstring(String s) {
        //review2
        //solution with slid window/ 2 pointers
        int l = 0;
        int longest = 0;
        Set charSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            int len = r - l + 1;
            longest = Math.max(longest, len);
        } 

        return longest;
    }
}
