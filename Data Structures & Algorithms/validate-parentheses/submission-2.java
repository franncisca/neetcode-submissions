class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenthese = new HashMap<>();
        parenthese.put(')', '(');
        parenthese.put('}', '{');
        parenthese.put(']', '[');

        if (s.length()%2 != 0) {
            return false;
        }
        List<Character> open = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                open.add(c);
                System.out.println("c: " + c);
            }
            else {
                if (open.isEmpty()) {
                    return false;
                }
                Character openC = open.get(open.size() - 1);
                if(! openC.equals(parenthese.get(c))) {
                    return false;
                } 
                else {
                    open.remove(openC);
                }
            }
        }

        if (!open.isEmpty()) {
                    return false;
                }

        return true;
        
    }
}
