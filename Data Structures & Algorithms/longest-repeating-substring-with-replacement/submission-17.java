class Solution {
    public int characterReplacement(String s, int k) {
        //Review4 solution with slide window
        Map<Character, Integer> freq = new HashMap<>();
        int l = 0;
        int maxF = 0;
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxF = Math.max(maxF, freq.get(c));

            while ((r - l + 1) - maxF > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
