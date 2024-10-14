class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for(int s:hm.keySet()){
            if(hm.get(s)>(nums.length/2)){
                return s;
            }
        }
        return -1;
    }
}