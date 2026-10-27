class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n=nums.length;
        int i=0;
        int j=1;
        int ans[]= new int[2];
        for(i=0; i<n-1; i++){
           while(j<n){
                if(nums[i]+nums[j]==t && i!=j){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
                j++;
           }
           j=i+1;
        }
        return ans;
    }
}
