class Solution {
    public boolean isAnagram(String s, String t) {
        //Review1
        //Somution with HashMap suppose only a-z
        HashMap<Character,Integer> sCounter = new HashMap();
        HashMap<Character,Integer> tCounter = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            sCounter.put(s.charAt(i), sCounter.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            tCounter.put(t.charAt(i), tCounter.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCounter.equals(tCounter);

    }
}
