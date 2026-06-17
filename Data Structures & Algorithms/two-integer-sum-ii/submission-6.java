class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //HashMap
        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];

            if (indexes.containsKey(diff)) {
                return new int[] {indexes.get(diff), i + 1};
            }

            indexes.put(numbers[i], i + 1);
        }

        return new int[0];
    }
}
