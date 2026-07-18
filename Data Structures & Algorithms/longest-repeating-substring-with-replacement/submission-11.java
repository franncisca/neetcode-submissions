class Solution {
    public int characterReplacement(String s, int k) {
        //Review2 
        //Solution with hashmap and T is O(n)
        Map<Character, Integer> freqS = new HashMap<>();
        int l = 0;
        int res = 0;
        int maxF = 0;
        for (int r = 0; r < s.length(); r++) {
            freqS.put(s.charAt(r), freqS.getOrDefault(s.charAt(r), 0) + 1);
            //maxF is the highest frequency seen fo far, 
            //if the temp maxF is smaller won't effect the valid result
            maxF = Math.max(maxF, freqS.get(s.charAt(r)));

            if ((r - l + 1) - maxF > k) {
                freqS.put(s.charAt(l), freqS.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);

        }

        return res;
    }
}
