class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Review 1
        //How to initialize a list array
        //The type of map entry is Map.Entry<Integer, Integer>
        //map.entrySet() to get the entry set
        Map<Integer, Integer> frequents = new HashMap<>();
        List<Integer>[] sameFrequents = new List[nums.length + 1];

        for (int i = 0; i < sameFrequents.length; i++) {
            sameFrequents[i] = new ArrayList<>();
        }

        for (int num : nums) {
            frequents.put(num, frequents.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> frequent : frequents.entrySet()) {
            sameFrequents[frequent.getValue()].add(frequent.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = sameFrequents.length - 1; i > 0 && index < k; i--) {
            for (int num : sameFrequents[i]) {
                res[index++] = num;
                //Only need k size of number
                if (index == k) {
                    return res;
                }
            }
        }

        return res;

    }
}
