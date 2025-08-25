class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            c++;
            if(nums[i]!=1){
                c=0;
            }
            if(c>max)
                max=c;
        }
        return max;
    }
}