class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int l=0,count=0;
        int len=s.length();
        for(int r=0;r<len;r++){
            if(r-l+1==k){
                int n=Integer.parseInt(s.substring(l,r+1));
                if(n!=0 && num%n==0) count++;
            l++;
            }
        }
        return count;
    }
}