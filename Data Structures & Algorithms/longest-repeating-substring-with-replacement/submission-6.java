class Solution {
    public int characterReplacement(String s, int k) {
        //Slide window with HashMap
        //Time O(26*n)
        //Speace O(n)
        Map<Character, Integer> countF = new HashMap<>();
        //AABABBA k = 1

        int l = 0;
        int res = 0;
        int maxF = 0;
        for (int r = 0; r < s.length(); r++) {
            countF.put(s.charAt(r), countF.getOrDefault(s.charAt(r), 0) + 1);
            
            for (int freq : countF.values()) {
                maxF = Math.max(freq, maxF);
            }
            System.out.println("maxF: " + maxF);

            System.out.println("r: " + r);
            System.out.println("l: " + l);

            if ((r - l + 1) - maxF > k) {
                //use put to change the value in a map!!!
                countF.put(s.charAt(l), countF.get(s.charAt(l)) - 1);
                l++;
            }
            

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
