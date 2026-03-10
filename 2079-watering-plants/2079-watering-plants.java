class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int dist=0;
        int water=capacity;
        for(int i=0;i<plants.length;i++){
            if(water<plants[i]){
                dist+=2*i;
                water=capacity;
            }
            dist++;
            water-=plants[i];
        }
        return dist;
    }
}