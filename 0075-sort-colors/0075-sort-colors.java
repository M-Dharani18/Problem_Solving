class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]<nums[i]){
        //             int temp=nums[j];
        //             nums[j]=nums[i];
        //             nums[i]=temp;
        //         }
        //     }

        int j=0;
        int c=0,c1=0,c2=0;
        for(int num : nums){
            if(num == 0){
                c++;
            }
             if(num == 1){
                c1++;
            }
             if(num == 2){
                c2++;
            }
        } 
        for(int i=0;i<c;i++){
            nums[j++]=0;
        }
        for(int i=0;i<c1;i++){
            nums[j++]=1;
        }
        for(int i=0;i<c2;i++){
            nums[j++]=2;
        }
    }
}