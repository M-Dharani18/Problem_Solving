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
    //    int r=0,w=0,b=0;
    //    for(int num:nums){
    //     if(num ==0) r++;
    //     if(num ==1) w++;
    //     if(num ==2) b++;
    //    }
    //    int i=0;
    //     while(r-- >0)
    //         nums[i++]=0;
    //     while(w-- >0)
    //         nums[i++]=1;
    //     while(b-- >0)
    //         nums[i++]=2;

    int j=0;
        int count=0,  count1=0, count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
             if(nums[i]==1){
                count1++;
            }
             if(nums[i]==2){
                count2++;
            }
        }
        for(int i=0;i<count;i++){
            nums[j++]=0;
        }
          for(int i=0;i<count1;i++){
            nums[j++]=1;
        }
          for(int i=0;i<count2;i++){
            nums[j++]=2;
        }
       }
    }