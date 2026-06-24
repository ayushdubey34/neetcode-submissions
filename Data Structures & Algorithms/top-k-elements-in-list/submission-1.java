class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int l = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<l;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;

    }
}
