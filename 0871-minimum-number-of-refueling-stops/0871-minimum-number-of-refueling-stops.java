class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel > target) return 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int fuel = startFuel;
        int count=0,i=0;
        while(fuel < target){
            while(i<stations.length && stations[i][0]<=fuel){
                maxHeap.add(stations[i][1]);
                i++;
            }
            if(maxHeap.isEmpty()) return -1;

            fuel+=maxHeap.poll();
            count++;
        }
        return count;
    }
}