class Solution {
    public int unequalTriplets(int[] nums) {
        int l=nums.length;
        int ans=0;
        for (int i = 0; i < l-2; i++)
        {
           for (int j = i+1; j < l-1; j++)
           {
               for (int k = j+1; k < l; k++)
                   if (nums[i]!=nums[j] && nums[j]!=nums[k] && nums[i]!=nums[k])
                       ans++;
           }
        }
        return ans;
    }
}