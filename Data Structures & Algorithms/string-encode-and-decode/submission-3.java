class Solution {
    //Review2
    //Solution with delimiter and string length

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str :  strs) {
            res.append(str.length()).append('#').append(str); 
        }
        
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int strLength = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + strLength;
            String value = str.substring(i, j);
            res.add(value);
            i = j;
        }

        return res;
    }
}
