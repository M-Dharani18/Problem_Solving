class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(mp.containsKey(nums[i])){
        //         if(Math.abs(mp.get(nums[i])-i)<=k) return true;
        //     }
        //     mp.put(nums[i],i);
        // }
        // return false;
        int l=0;
        Set<Integer> s = new HashSet<>();
        for(int r=0;r<nums.length;r++){
            if(s.contains(nums[r])){
                return true;
            }
            s.add(nums[r]);
            if(r-l+1>k){
                s.remove(nums[l]);
                l++;
            }
        }
        return false;}
}