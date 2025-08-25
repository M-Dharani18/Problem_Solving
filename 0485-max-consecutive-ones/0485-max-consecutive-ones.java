class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count=0,max_count=0;
        for(int i:nums){
            current_count++;
            if(i!=1){
                current_count=0;}
            if(current_count>max_count)
                max_count=current_count;
        }
        return max_count;
    }
}