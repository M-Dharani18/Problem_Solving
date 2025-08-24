class Solution {
    public void duplicateZeros(int[] arr) {
        // List<Integer> l = new ArrayList<>();
        // for(int num:arr){
        //     l.add(num);
        //     if(num==0)
        //     l.add(num);
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = l.get(i); 
        // }

        int n = arr.length;
        int[] nums = Arrays.copyOf(arr,n);
        for(int i=0,j=0;i<n && j<n ;i++){
            arr[j]=nums[i];
            j++;
            if(nums[i]==0 && j<n){
                arr[j]=nums[i];
                j++;
            }
        }

    } 
}