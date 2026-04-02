class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        Double maxavg=Double.NEGATIVE_INFINITY,avg=0.0;
        int l=0,sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-l+1==k){
                avg=(double)sum/k;
                sum-=nums[l];
                l++;
            maxavg=Math.max(avg,maxavg);
            }
        }
        return maxavg;
    }
}