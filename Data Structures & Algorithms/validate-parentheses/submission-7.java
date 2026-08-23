class Solution {
    public boolean isValid(String s) {
        //Solution with Stack
        //Stack of open parenthese
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            //if it's a close parenthese
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == 
                closeToOpen.get(c)
                ) {
                    stack.pop();
                } else {
                    return false;
                }
                //push open parenthese to the stack
            } else {
                stack.push(c);
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
