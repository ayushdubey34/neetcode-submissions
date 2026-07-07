class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l  = nums.length;
        int ans[] = new int[l];
        int product = 1;
        int zeroCount = 0;
        for(int number : nums){
            if(number==0){
              zeroCount++;  
            }
            if(zeroCount<=1 && number!=0){
                product *= number;
            }
            else if(zeroCount>1){
                product = 0;
                break;
            }
            else{
                continue;
            }
            
        }
        System.out.println(product);
        for(int i=0;i<l;i++){
            if(product==0){
                ans[i] = 0;
            }
            else{
                if(nums[i]!=0 && zeroCount==0){
                    int val = product/nums[i];
                    ans[i] = val;
                }
                else if(nums[i]!=0 && zeroCount>0){
                    ans[i] = 0;
                }
                else{
                    ans[i] = product;
                }
                
            }
            
        }
        return ans;
    }
}  
