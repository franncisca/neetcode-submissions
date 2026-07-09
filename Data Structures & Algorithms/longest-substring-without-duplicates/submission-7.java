class Solution {
    public int lengthOfLongestSubstring(String s) {
        //More difficult than image
        if (s.length() == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int res = 0;
        Set<Character> charSet = new HashSet<>(); 
        
        while (r < s.length()) {
            while (charSet.contains(s.charAt(r))){
                System.out.println("r: " + r + ", l: " + l);
                charSet.remove(s.charAt(l));
                l++;
            }
           
            charSet.add(s.charAt(r));
            //System.out.println("r: " + r + ", l: " + l);
            res = Math.max(res, r - l + 1);
            
            r++;
        }
        return res;
    }
}
