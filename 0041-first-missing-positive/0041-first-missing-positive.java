class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=0;
        int n=nums.length;
        Set<Integer> m = new HashSet<>();
        for(int i=0;i<n;i++){
            m.add(nums[i]);
        }
        for(int j=1;j<=n;j++){
            if(!m.contains(j)) return j;   
        }
        
        return n+1;
    }
}