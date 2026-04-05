class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,sum=0;
        double maxavg=Double.NEGATIVE_INFINITY;
        for(int j=0;j<nums.length;j++){
            if(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            sum+=nums[j];
            if(j-i+1==k){
            maxavg=Math.max(maxavg,(double)sum/k);}
        }
        return maxavg;
    }
}