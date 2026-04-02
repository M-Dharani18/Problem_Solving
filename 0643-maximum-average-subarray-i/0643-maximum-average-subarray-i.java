class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        Double maxavg=Double.NEGATIVE_INFINITY;
        int l=0,sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(r-l+1>k){
                sum-=nums[l];
                l++;
            }
            if(r-l+1==k){
                maxavg=Math.max((double)sum/k,maxavg); }
        }
        return maxavg;
    }
}