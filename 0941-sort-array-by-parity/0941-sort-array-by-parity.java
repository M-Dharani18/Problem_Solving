class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp=nums[a];
                nums[a]=nums[i];
                nums[i]=temp;
                a++;}
        }
        return nums;
        }
}