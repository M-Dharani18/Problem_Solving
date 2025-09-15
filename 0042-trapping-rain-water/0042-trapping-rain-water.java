class Solution {
    public int trap(int[] height) {
        // int[] lmax = new int[height.length];
        // int[] rmax = new int[height.length];
        // int max=0;
        // for(int i=0;i<height.length;i++){
        //     if(height[i]>max) 
        //     {
        //         max=height[i];  
        //     }
        //      lmax[i]=max;}
        // max=0;
        // for(int i=height.length-1;i>=0;i--){
        //     if(height[i]>max) {
        //     max=height[i];}
        //     rmax[i]=max;
        // }
        // int total=0;
        // for(int i=0;i<height.length;i++){
        // total+=Math.min(lmax[i],rmax[i])-height[i];}
        // return total;

        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
            lmax[i]=max;
        }
        max=0;
        for(int j=height.length-1;j>=0;j--){
            if(height[j]>max){
                max=height[j];
            }
            rmax[j]=max;
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return total;
    }
}