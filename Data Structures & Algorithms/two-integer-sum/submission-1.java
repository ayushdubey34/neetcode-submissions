class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int ans[] = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<l;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<l;i++){
            int val = nums[i];
            int diff = target-val;
            if(mp.containsKey(diff) && mp.get(diff)!=i){
                ans[0] = i;
                ans[1] = mp.get(diff);
                break;
            }
        }
        return ans;
    }
}
