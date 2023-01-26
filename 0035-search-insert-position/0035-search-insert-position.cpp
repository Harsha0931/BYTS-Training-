class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n=nums.size();
        int mid,lo=0,hi=n-1;
        while(lo<=hi){
            //lo mid
            mid=lo+(hi-lo)/2;
            if(lo==hi){
                if(nums[lo]<target)
                    return lo+1;
                else
                    return lo;
            }
            if(nums[mid]<target){
                lo=mid +1 ;
            }
            else{
                hi=mid;
            }
        }
        
        return lo;
    }
};