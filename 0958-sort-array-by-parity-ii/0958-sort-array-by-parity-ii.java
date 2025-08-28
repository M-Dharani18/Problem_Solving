class Solution {
    public int[] sortArrayByParityII(int[] nums) {
//         int e=0,o=1;
//         int n=nums.length;
//         while(e<n && o<n){
//             if((nums[e]%2)==0){
//                 e+=2;}
//             else if((nums[o]%2)==1){
//                 o+=2;
//             }
//             else{
//                 int temp=nums[e];
//                 nums[e]=nums[o];
//                 nums[o]=temp;
//                 e+=2;
//                 o+=2;
//             }
//         }
//         return nums;
//     }
// }
        int[] res = new int[nums.length];
        int siz=nums.length;
        int[] odd = new int[siz/2];
        int[] even = new int[siz/2];
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[e]=nums[i];
                e++;
            }
            else{
                odd[o]=nums[i];
                o++;
            }
        }
        for(int m=0,a=0,b=0;m<nums.length;m++){
            if((m%2)==0){
                res[m]=even[a];
                a++;
            }
            else{
                res[m]=odd[b];
                b++;
            }
        }
        return res;
    }
}