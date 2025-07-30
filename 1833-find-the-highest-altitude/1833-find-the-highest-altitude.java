class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] res=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            res[i]=gain[i-1]+res[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int num:res){
            max=num>max?num:max;
        }
        return max;
    }
}