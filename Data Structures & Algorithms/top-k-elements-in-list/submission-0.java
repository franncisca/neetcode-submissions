class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        //Initialize freq
        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        //Get frequence of each num
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        //Get all the nums of same freqence
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        //Collect k results from n to 1
        int collector = 0;
        int[] results = new int[k];
        for (int i = freq.length - 1; i > 0 && collector < k; i--) {
            for (int num : freq[i]) {
                results[collector++] = num;
                if (collector == k) {
                    return results;
                }
            }
        }

        return results;
        
    }
}
