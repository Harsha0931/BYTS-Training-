class Solution {
    public int pivotIndex(int[] nums) {
        int a=0,b=0,piv=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            piv=i;
            a=0;
            b=0;
            for(int j=0;j<piv;j++){
                a+=nums[j];
            }
            for(int k=piv+1;k<n;k++){
                b+=nums[k];
            }
            if(a==b){
                return piv;
            }
        }
        return -1;
        
    }
}