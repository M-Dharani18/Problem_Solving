class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int diff,mindiff=Integer.MAX_VALUE;
       for(int i=0;i<=nums.length-k;i++){
            diff=nums[i+k-1] - nums[i];
            mindiff = Math.min(diff,mindiff);
       }
       return mindiff;
    }
}