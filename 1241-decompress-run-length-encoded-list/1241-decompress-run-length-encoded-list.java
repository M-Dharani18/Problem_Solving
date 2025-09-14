class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int k=0;k<nums.length;k+=2){
            size+=nums[k];
        }
        int[] arr = new int[size];
        int pos=0;
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            int j=0;
            while(j<freq){
            arr[pos]=val;
            pos++;
            j++;}
        }
        return arr;
    }
}