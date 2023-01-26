class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length ;
        String[] ans = new String[n];
        int[] sorted = new int[n];
        int index = 0 ;
        for(int num : heights)
        {
            sorted[index] = num ;
            index++ ;  
        }
        index = 0 ;
        for(int i = 0 ; i < n - 1 ; i++ )
        {
            for(int j = i+1 ; j < n ; j ++)
            {
                if(sorted[i] < sorted[j] )
                {
                    int temp = sorted[i] ;
                    sorted[i] = sorted[j] ;
                    sorted[j] = temp ;
                }
            }   
        }
        int k ;
        for(int val : sorted )
        {
            for( k = 0 ; k < n ; k++)
            {
                if(val == heights[k])
                    break ;
            }
            ans[index] = names[k] ;
            index++ ;
        }
        return ans ;
    }
}