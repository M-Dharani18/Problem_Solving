class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        // Set<Integer> s = new HashSet<>();
        // for(int i:nums){
        //     if(!s.add(i)) li.add(i);
        // }
        // return li;
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]<0) li.add(ind+1);
            else nums[ind]*=-1;
        }
        return li;
    }
}