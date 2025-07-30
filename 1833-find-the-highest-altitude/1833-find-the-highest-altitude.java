class Solution {
    public int largestAltitude(int[] gain) {
      int res=0,max=0;
      for(int i=0;i<gain.length;i++){
        res+=gain[i];
        if(res>max)
            max=res;
      }
      return max;
    }
}