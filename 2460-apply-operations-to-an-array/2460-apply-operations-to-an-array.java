class Solution {
     public int[] z(int arr[], int n)
    {
        int c = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0){
                arr[c++] = arr[i]; 
            }
        while (c< n){
            arr[c++] = 0;
     }
         return arr;
    }
    public int[] applyOperations(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l-1;++i){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }else{
                continue;
            }
        }
        return z(nums,l);
    }
}