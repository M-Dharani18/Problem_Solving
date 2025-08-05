class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int allotted=0;
       for(int i=0;i<fruits.length;i++){
        for(int j=0;j<baskets.length;j++){
            if(fruits[i]<=baskets[j]){
                allotted++;
                baskets[j]=-1;
                break;
            }
        }
       }
       return fruits.length-allotted;
    }
}