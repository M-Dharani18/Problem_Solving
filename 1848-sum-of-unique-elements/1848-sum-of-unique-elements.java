class Solution {
    public int sumOfUnique(int[] nums) {
    //     Map<Integer,Integer> m=new HashMap<>();
    //     for(int num:nums){
    //         m.put(num,m.getOrDefault(num,0)+1);
    //     }
    //     int s=0;
    //     for (int key : m.keySet()) {
    //         if (m.get(key) == 1) {
    //             s += key; 
    //         }
    //     }
    // return s;}
    int s=0;
    int freq[]=new int[1000];
    for(int i:nums){
        freq[i]++;
    }
    for(int i=0;i<1000;i++){
        if(freq[i]==1)
            s+=i;
    }
    return s;
    }
}