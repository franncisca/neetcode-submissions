class Solution {
    public String minWindow(String s, String t) {
        //Review1 solution with slide window 

        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapCurrent = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int minSize = Integer.MAX_VALUE;
        int minStart = 0;

        for (int r = 0; r < s.length(); r++) {
            mapCurrent.put(
                s.charAt(r), 
                mapCurrent.getOrDefault(s.charAt(r), 0) + 1
            );
            while (containMap(mapCurrent, mapT)) {
                //minStart and minSizen is a pair
                if (r - l + 1 < minSize) {
                    minSize = r - l + 1 ;
                    minStart = l;
                }
                mapCurrent.put(
                    s.charAt(l), 
                    mapCurrent.get(s.charAt(l)) - 1
                );
                //Update in the end !!!
                l++;
            }
            System.out.println("l: " + l);
            System.out.println("r: " + r);
        }

        if (minSize == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minSize);
    }

    private boolean containMap(
        Map<Character, Integer> mapS,
        Map<Character, Integer> mapT
    ) {
        for(Character c : mapT.keySet()) {
            if (mapS.getOrDefault(c,0) < mapT.get(c)) {
                return false;
            }
        }
        return true;
    }
    
}
