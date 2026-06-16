class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        boolean duplicate = false;
        for(int i=0;i<l-1;i++){
            if(nums[i+1]==nums[i]){
                duplicate = true;
                return duplicate;
            }

        }
        return duplicate;
    }
}