class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int digit=0;
            int temp=nums[i];
            while(temp>0){
                digit++;
                temp/=10;
            }
            if((digit&1)==0) c++;
        }
        return c;
    }
}