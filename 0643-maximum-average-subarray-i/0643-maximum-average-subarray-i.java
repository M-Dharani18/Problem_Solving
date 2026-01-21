class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0;
        double maxAvg= Double.NEGATIVE_INFINITY;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(r-l+1>k){
                sum-=nums[l];
                l++;
            }
            if(r-l+1==k){
                maxAvg=Math.max(maxAvg,(double)sum/k);
            }
            r++;
        }
        return maxAvg;
    }
}