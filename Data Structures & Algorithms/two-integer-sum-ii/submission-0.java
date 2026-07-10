class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        int p1 = 0;
        int p2 = l-1;
        int[] ans = new int[2];
        while(p1<p2){
            int val = numbers[p1]+numbers[p2];
            if(val==target){
                ans[0] = p1+1; //Assuming 1-indexed array for the question
                ans[1] = p2+1;
                break;
            }
            else if(val<target){
                p1++;
            }
            else{
                p2--;
            }
        }
        return ans;
    }
}
