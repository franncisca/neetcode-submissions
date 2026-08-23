class Solution {
    public boolean isValid(String s) {
        //Solution brute force
        while (
            s.contains("()") || 
            s.contains("{}") || 
            s.contains("[]")
        ) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}
