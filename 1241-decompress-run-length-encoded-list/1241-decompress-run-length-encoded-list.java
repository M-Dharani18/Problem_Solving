class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum=0;
        for(int k=0;k<nums.length;k+=2){
            sum+=nums[k];
        }
        int[] arr = new int[sum];
        int freq,val;
        int pos=0;
        for(int i=0;i<nums.length;i+=2){
            freq=nums[i];
            val=nums[i+1];
            int j=0;
            while(j<freq){
            arr[pos]=val;
            pos++;
            j++;}
        }
        return arr;
    }
}