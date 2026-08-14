class Solution {
    public int characterReplacement(String s, int k) {
        //Review3 Solution with HashMap
        int result = 0;
        Map<Character, Integer> count = new HashMap<>();
        int maxF = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, count.get(s.charAt(r)));
            
            int currentLen = r - l + 1;
            if (currentLen - maxF > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            //l is updated, should not use the previous one
            result = Math.max(r - l + 1, result);
        }

        return result;
    }
}
