class Solution {
    public int largestAltitude(int[] gain) {
      int res=0,max=0;
      for(int g : gain){
        res+=g;
        if(res>max)
            max=res;
      }
      return max;
    }
}