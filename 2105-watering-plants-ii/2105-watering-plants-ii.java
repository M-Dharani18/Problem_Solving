class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refill=0;
        int waterA=capacityA;
        int waterB=capacityB;
        int n=plants.length;
        // if(n==1 && plants[0]<=capacityA) return 0;
        //     for(int i=0;i<n/2;i++){
        //         if(waterA<plants[i]){
        //             refill++;
        //             waterA=capacityA;
        //         }
        //         waterA-=plants[i];
        //     }
        //     if(n%2==0){
        //     for(int i=n-1;i>=n/2;i--){
        //         if(waterB<plants[i]){
        //             refill++;
        //             waterB=capacityB;
        //         }
        //         waterB-=plants[i];
        //     }
        //     }
        //     else{
        //         for(int i=n-1;i>n/2;i--){
        //         if(waterB<plants[i]){
        //             refill++;
        //             waterB=capacityB;
        //             }
        //             waterB-=plants[i];
        //         }
        //         if(waterA<plants[n/2] && waterB<plants[n/2]) refill++;
        //     }
        //     return refill;
        int left=0,right=n-1;
        while(left<right){
            if(waterA<plants[left]){
                refill++;
                waterA=capacityA;
            }
            waterA-=plants[left];
            left++;
            if(waterB<plants[right]){
                refill++;
                waterB=capacityB;
            }
            waterB-=plants[right];
            right--;
        }
        if(left==right){
            if(Math.max(waterA,waterB)<plants[left]) refill++;
        }
        return refill;

        }
    }