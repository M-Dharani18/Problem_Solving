class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    l.add(arr2[i]);
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int m:arr1){
            if(m!=-1){
                l.add(m);
            }
        }
       return l.stream().mapToInt(Integer::intValue).toArray();
    }
}