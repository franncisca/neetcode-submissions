class Solution {
    public int characterReplacement(String s, int k) {
        //Slide window
        //ABAABB k=2
        //s.toCharArray()
        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()) {
            charSet.add(c);
        }

        int res = 0;
        //char not Character
        for (char c : charSet) {
            int l = 0;
            int count = 0;
            for (int r = 0; r < s.length(); r++) {
                //the c exists in the substring
                if (s.charAt(r) == c) {
                    count++;
                }

                //Shink the substring if the substring is not valid 
                while((r - l + 1) - count > k) {
                    //descrease the count of c if the most left one is c
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }

                res = Math.max(res, r - l + 1);
            }
        }

        return res;
    }
}
