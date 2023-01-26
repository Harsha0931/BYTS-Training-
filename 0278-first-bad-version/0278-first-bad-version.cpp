class Solution {
public:
    int firstBadVersion(int n) {
        int s=1,e=n,mid,ans=0;
        while(s<e)
        {
            mid=s+(e-s)/2;
            if(!isBadVersion(mid))
            {
               
                s=mid+1;
            }
            else
            e=mid;
        }
        return s;
    }
};