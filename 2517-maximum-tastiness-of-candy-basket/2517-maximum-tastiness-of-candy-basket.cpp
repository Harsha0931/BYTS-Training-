class Solution
{
public:
    int maximumTastiness(vector<int> &price, int k)
    {
        sort(price.begin(), price.end());
        int n = price.size();
        // minimum value can be zero while maximum can be (maxPrice - minPrice)..
        long long left = 0, right = price[n - 1] - price[0], result = 0;
        while (left <= right)
        {
            long long mid = (left + right) / 2;
            int temp = 0;
            int i = 0;

            // To check whether this mid can be our answer...
            while (i < n)
            {
                int idx = lower_bound(price.begin(), price.end(), price[i] + mid) - price.begin();
                i = idx;
                temp++;
                if (temp >= k)
                    break;
            }
            // If this mid can be our answer,check for higher value and mark left as mid + 1 otherwise mark right as mid -1..
            if (temp >= k)
            {
                left = mid + 1;
                result = max(result, mid);
            }
            else
            {
                right = mid - 1;
            }
        }
        int res = result;
        return res;
    }
};