class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int s=0;

        for (int key : m.keySet()) {
            if (m.get(key) == 1) {
                s += key; 
            }
        }
        return s;}
}