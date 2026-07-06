class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Review 1
        //Solution with hashmap
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (index.containsKey(diff)) {
                return new int[] {index.get(diff), i + 1};
            }
                index.put(numbers[i], i + 1);
        }

        return new int[0];

    }
}
