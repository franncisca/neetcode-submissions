class Solution {
    public boolean isAnagram(String s, String t) {
        //Review4
        //HashMap solution
        //T o(n)
        //S O(n)
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            freqS.put(s.charAt(i), freqS.getOrDefault(s.charAt(i), 0) + 1);
            freqT.put(t.charAt(i), freqT.getOrDefault(t.charAt(i), 0) + 1);

        }

        return freqS.equals(freqT);
    }
}
