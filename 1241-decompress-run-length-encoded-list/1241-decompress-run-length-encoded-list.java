class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int[] arr = new int[100];
        int freq,val;
        for(int i=0;i<nums.length;i+=2){
            freq=nums[i];
            val=nums[i+1];
            int j=0;
            while(j<freq){
            l.add(val);
            j++;}
        }
        arr = l.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}