int missingNumber(int* nums, int numsSize) {
    int asum,sum=0,diff;
    asum=numsSize*(numsSize+1)/2;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
    }
    diff=asum-sum;
    return diff;
}