class Solution {
    //Solution with length-prefixed and delimiter

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();

        for (String str : strs) {
            res.append(str.length())
            .append("#")
            .append(str);
        }

        return res.toString();

    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            //J is the index of length size
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }

            //5#hellow2#ab
            int strLength = Integer.parseInt(str.substring(i, j));

            //+1 for thr delimiter
            i = j+1;
            res.add(str.substring(i, i + strLength));
            i = i + strLength;
            j = i;
        }

        return res;
    }
}
