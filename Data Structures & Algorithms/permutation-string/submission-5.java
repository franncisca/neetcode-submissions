class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Solution with hashmap 
        //T: O(m * n) S: O(m * n)

        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
       
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        for (int r = s1.length() - 1; r < s2.length(); r++) {
            Map<Character, Integer> temp = new HashMap<>();

            for (int i = l; i <= r; i++) {
                temp.put(s2.charAt(i), temp.getOrDefault(s2.charAt(i), 0) + 1);
            }

            if (map1.equals(temp)) {
                return true;
            }

            l++;
        }

        return false;
    }
}
