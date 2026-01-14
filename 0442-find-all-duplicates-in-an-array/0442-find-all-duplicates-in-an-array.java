class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            if(!s.add(i)) li.add(i);
        }
        return li;
    }
}