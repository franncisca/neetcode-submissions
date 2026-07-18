class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqS = new HashMap<>();
        int l = 0;
        int res = 0;
        int maxF = 0;
        for (int r = 0; r < s.length(); r++) {
            freqS.put(s.charAt(r), freqS.getOrDefault(s.charAt(r), 0) + 1);
            
            for (int freq : freqS.values()) {
                maxF = Math.max(maxF, freq);
            }

            System.out.println("maxF: " + maxF);

            if ((r - l + 1) - maxF > k) {
                freqS.put(s.charAt(l), freqS.get(s.charAt(l)) - 1);
                l++;
            }

            System.out.println("r: " + r);
            System.out.println("l: " + l);

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
