int findDuplicate(int* nums, int numsSize){
   int x[numsSize-1];
   for(int i=0;i<numsSize-1;i++){
       x[i]=0;
    }
    for(int i=0;i<=numsSize;i++)
    {
        x[nums[i]-1]+=1;
        if(x[nums[i]-1]>1)
           return nums[i];
    }
    return 0;
}
