class Solution {
    public int lengthOfLongestSubstring(String s) {
        //review2
        //solution with sliding window/ 2 pointers
        int l = 0;
        int longest = 0;
        Set charSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            //remove all the duplicates, that's why we use while
            while (charSet.contains(s.charAt(r))) {
                //remove from side
                charSet.remove(s.charAt(l));
                //remove from the sliding window
                l++;
            }
            charSet.add(s.charAt(r));
            int len = r - l + 1;
            longest = Math.max(longest, len);
        } 

        return longest;
    }
}
