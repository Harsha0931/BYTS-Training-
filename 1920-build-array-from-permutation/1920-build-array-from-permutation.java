class Solution {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int[] nums1=new int[len];
        for(int i=0;i<len;++i){
            nums1[i]=nums[nums[i]];
        }
        return nums1;
    }
}