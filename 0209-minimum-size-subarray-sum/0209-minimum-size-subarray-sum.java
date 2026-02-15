class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                int len=r-l+1;
                minlen=Math.min(len,minlen);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}