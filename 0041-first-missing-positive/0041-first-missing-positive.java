class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=nums[0];
        int res=0;
        Set<Integer> m = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.add(nums[i]);
            if(nums[i]>=max) max=nums[i];
            if(max==0||max<0) res=1;
        }
        for(int j=1;j<=max;j++){
            if(!m.contains(j)) {
                res=j; 
                break;}
            else{
                res=max+1;
            }
        }
        return res;
    }
}