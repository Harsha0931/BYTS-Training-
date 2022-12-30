void sortColors(int* nums, int numsSize){
    int az=0,co=0;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==0) 
           ++az;
        if(nums[i]==1) 
           ++co;
    }
    for(int i=0;i<az;i++)
       nums[i]=0;
    for(int i=az;i<az+co;i++)
       nums[i]=1;
    for(int i=az+co;i<numsSize;i++)
       nums[i]=2;
}
