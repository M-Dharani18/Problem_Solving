class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int[] res = new int[nums1.length];
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int num : nums2){
           while(!st.isEmpty() && num >st.peek()){
            m.put(st.pop(),num);
           }
           st.push(num);
        }
        while(!st.isEmpty()){
            m.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            res[i] = m.get(nums1[i]);
        }
        return res;
    }
}