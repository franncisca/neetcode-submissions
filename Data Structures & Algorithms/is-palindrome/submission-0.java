class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;

        while (l < r) {
            //Skip non-alpha chars from left
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }

            //Skip non-alpha chars from right
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }

            //If left char not equals to right char, return false
            if (Character.toLowerCase(s.charAt(l)) != (
                Character.toLowerCase(s.charAt(r))
            )) {
                return false;
            }
            
            l++;
            r--;
        }
        
        return true;
    }

    private boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
