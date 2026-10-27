class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> map: hm.entrySet()){
            if(map.getValue()>1){
                return true;
            }
        }
        return false;
    }
}