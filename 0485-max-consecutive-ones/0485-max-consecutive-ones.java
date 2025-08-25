class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i:nums){
            c++;
            if(i!=1){
                c=0;}
            if(c>max)
                max=c;
        }
        return max;
    }
}