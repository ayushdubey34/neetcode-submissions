class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int data: nums){
            hs.add(data);
        }
        int[] uniqueNums = hs.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(uniqueNums);
        int  l = uniqueNums.length;
        int p1=0;
        int p2=1;
        int maxLength = 1;
        int ans = 1;
        while(p1<=p2 && p2<l){
            if(uniqueNums[p2]-uniqueNums[p2-1]==1){
                maxLength++;
                ans = Math.max(ans,maxLength);
                p2++;
            }
            else{
                p1 = p2;
                maxLength = 1;
                p2++;
            }
        }
        return ans;
    }
}
