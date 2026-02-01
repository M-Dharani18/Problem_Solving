class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index=0;
        int[] res = new int[2*n];
        // for(int i=0;i<n;i++){
        //         res[index]=nums[i];
        //         index+=2;
        //     }
        // index=1;
        //     for(int j=n;j<n*2;j++){
        //         if(index%2==1){
        //             res[index]=nums[j];
        //             index+=2;}
        //     }
        for(int i=0;i<n;i++){
            res[index++]=nums[i];
            res[index++]=nums[i+n];
        }
        return res;
    }
}