class Solution {
    public boolean isValid(String s) {
        //review1 solution with stack
        Stack<Character> openStack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        

        for (char c : s.toCharArray()) {
            if (c == '(' || 
                c == '[' ||
                c == '{') {
                openStack.push(c);
            }
            else {
                if (openStack.isEmpty()) {
                    return false;
                }
                Character last = openStack.peek();
                if (last != closeToOpen.get(c)) {
                    return false;
                }
                openStack.pop();
            }
        }
        if (!openStack.isEmpty()) {
            return false;
        }
        return true;
    }
}
