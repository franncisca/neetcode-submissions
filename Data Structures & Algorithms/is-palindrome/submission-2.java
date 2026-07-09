class Solution {
    public boolean isPalindrome(String s) {
        //review1 2 pointers
        //str.toUpperCase() metod
        //any better way than use stringBuilder
        StringBuilder sb = new StringBuilder();
        String upperS = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = upperS.charAt(i);
            System.out.println("c: " + c);
            if ('A' <= c && c <= 'Z' || '0' <= c && c <= '9') {
                
                sb.append(c);
            }
        }

        String filteredS = sb.toString();

        int l = 0;
        int r = filteredS.length() - 1;

        while (l < r) {
            if (filteredS.charAt(l) != filteredS.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
       
    }
}
