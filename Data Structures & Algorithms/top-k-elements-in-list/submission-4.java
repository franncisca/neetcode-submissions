class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        //length + 1
        List<Integer>[] frequent = new List[nums.length + 1];

        for (int i = 0; i < frequent.length; i++) {
            frequent[i] = new ArrayList<>();
        }

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            frequent[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = frequent.length - 1; i >= 0; i--) {
            for (Integer n : frequent[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
            
        }

        return res;
    }
}
