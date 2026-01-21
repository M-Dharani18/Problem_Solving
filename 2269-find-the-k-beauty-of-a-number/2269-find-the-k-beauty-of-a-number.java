class Solution {
    public int divisorSubstrings(int num, int k) {
        int l=0,len=0,count=0;
        String s = String.valueOf(num);
        len=s.length();
        for(int r=0;r<len;r++){
            if (r - l + 1 == k) {
                int val = Integer.parseInt(s.substring(l, r + 1));
                if (val != 0 && num % val == 0) {
                    count++;
                }
                l++;
            }
        }
        return count;
    }
}