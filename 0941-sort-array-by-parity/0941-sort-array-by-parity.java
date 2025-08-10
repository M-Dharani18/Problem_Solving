class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int temp;
        while(a<b){
            if((nums[a] & 1)==0 && nums[b]%2==1){
                a++;
                b--;}
            else if((nums[a] & 1)==0){
                a++;}
            else if(nums[b]%2==1){
                b--;
            }
            else{
            temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;}
            }
        return nums;
    }
}