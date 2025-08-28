class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int siz=nums.length;
        int[] odd = new int[siz];
        int[] even = new int[siz];
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