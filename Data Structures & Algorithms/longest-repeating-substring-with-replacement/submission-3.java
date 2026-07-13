class Solution {
    public int characterReplacement(String s, int k) {
        //brute forece
        //Time O(26*n)
        //Speace O(n)
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countF = new HashMap<>();
            int maxf = 0;
            for (int j = i; j < s.length(); j++) {
                countF.put(s.charAt(j), countF.getOrDefault(s.charAt(j), 0) + 1);
                //Get the max frquency
                for (Integer value : countF.values()){
                    if (value > maxf) {
                        maxf = value;
                    }
                }

                if ((j - i + 1 )- maxf  <= k) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
        
    }
}
