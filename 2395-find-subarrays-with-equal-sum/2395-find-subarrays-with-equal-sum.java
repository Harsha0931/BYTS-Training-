class Solution {
    public boolean findSubarrays(int[] nums) {
        int len=nums.length;
        int sum=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<2;++i){
            sum+=nums[i];
        }list.add(sum);
        for(int i=1;i<len-1;++i){
            sum-=nums[i-1];
            sum+=nums[i+1];
            if(list.contains(sum))return true;
            else list.add(sum);
            
        }
        return false;
        
    }
}