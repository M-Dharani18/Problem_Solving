class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> m.get(b) - m.get(a));
        for (int key : m.keySet()) {
            maxHeap.offer(key);}
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=maxHeap.poll();
        }
        return arr;
    }
}