class Solution {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int l = 0;

        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);

            window.put(
                rightChar,
                window.getOrDefault(rightChar, 0) + 1
            );

            // when window is valid, shrink the window size
            while (containMap(window, mapT)) {
                int currentLength = r - l + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    minStart = l;
                }

                char leftChar = s.charAt(l);

                window.put(leftChar, window.get(leftChar) - 1);
                l++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLength);
    }

    private boolean containMap(
        Map<Character, Integer> mapS,
        Map<Character, Integer> mapT
    ) {
        for (Character c : mapT.keySet()) {
            int countInS = mapS.getOrDefault(c, 0);
            int countInT = mapT.get(c);

            if (countInS < countInT) {
                return false;
            }
        }

        return true;
    }
}