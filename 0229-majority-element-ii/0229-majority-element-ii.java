class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l = new ArrayList<>();
        int max=0;
        for(int key:m.keySet()){
            if(m.get(key)>n/3){
                l.add(key); }
        }
        return l;
    }
}