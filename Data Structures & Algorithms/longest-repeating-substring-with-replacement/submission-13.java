class Solution {
    public int characterReplacement(String s, int k) {
        //Review3 solution with solid window
        int l = 0;
        int maxF = 0;
        int maxLen = 0;
        Map<Character, Integer> mapF = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            Character currentC = s.charAt(r);
            mapF.put(
                currentC, 
                mapF.getOrDefault(currentC, 0) + 1
            );
            maxF = Math.max(maxF, mapF.get(currentC));
            int currentLen = r - l + 1;
            if (currentLen - maxF <= k) {
                maxLen = Math.max(maxLen, currentLen);
            } else{
                //Shrink current substring if not valide
                mapF.put(
                    s.charAt(l), 
                    mapF.getOrDefault(s.charAt(l), 0) - 1
                );
                l++;
            }
        }

        return maxLen;
        

    }
}
