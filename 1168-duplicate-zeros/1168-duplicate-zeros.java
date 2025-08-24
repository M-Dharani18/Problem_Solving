class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for(int num:arr){
            l.add(num);
            if(num==0)
            l.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.get(i); 
        }
    } 
}