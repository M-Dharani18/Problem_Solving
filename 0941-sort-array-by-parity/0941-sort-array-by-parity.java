class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0,b=nums.length-1,temp;
        while(a<b){
            if((nums[a]&1)==0)
                a++;
            if((nums[b]&1)==1)
                b--;
            else{
                temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
            }
        }
        return nums;  
    }
}