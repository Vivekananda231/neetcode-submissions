class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h= new HashMap<>();
        int ans[]= new int[2];
        for(int i=0; i<nums.length; i++){
            int rem = target- nums[i];
            if(h.containsKey(rem)){
                return new int[]{h.get(rem),i};
            }
            else{
                h.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
