class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countN = count(n);
        int f=1;
        for(int i=0;i<31;i++){
            if (Arrays.equals(countN,count(f)))
                return true;
            f=f<<1;
        }
        return false;
        }
        
        
    int[] count(int N){ 
        int[] arr=new int[10];
        while(N>0){
            arr[N%10]++;
            N/=10;}
        return arr;
    }
}