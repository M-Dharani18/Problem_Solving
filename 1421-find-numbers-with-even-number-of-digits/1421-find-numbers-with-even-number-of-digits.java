class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i : nums){
            int digit=0;
            while(i>0){
                digit++;
                i/=10;
            }
            if((digit&1)==0) c++;
        }
        return c;

        // int c=0;
        // for(int i : nums){
        //     String s = Integer.toString(i);
        //     if(s.length()%2==0) c++;
        // }
        // return c;
    }
}