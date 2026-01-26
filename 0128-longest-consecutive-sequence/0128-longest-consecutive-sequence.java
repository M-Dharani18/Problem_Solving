class Solution {
    public int longestConsecutive(int[] nums) {
        // Set<Integer> s= new HashSet<>();
        // if(nums.length==0) return 0;
        // int j=0;
        // for(int n:nums) s.add(n);
        // int res[]=new int[s.size()];
        // for(int i:s){
        //     res[j++]=i;
        // }
        // Arrays.sort(res);
        // int c=1,longest=1;
        // for(int i=0;i<res.length-1;i++){
        //     if(res[i]+1 == res[i+1]){
        //         c++;
        //     }else{
        //         c=1;
        //     }
        //     longest=Math.max(longest,c);
        // }
        // return longest;
        if(nums.length==0) return 0;
        Set<Integer> s = new HashSet<>();
        for(int i:nums) s.add(i);
        int longest=0;
        for(int i:s){
            if(!s.contains(i-1)){
            int curr=i;
            int count=1;
            while(s.contains(curr+1)){
                curr++;
                count++;
            }
            longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}