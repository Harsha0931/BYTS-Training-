class Solution {
    public int pivotInteger(int n) {
        int x=1;
        while(x<=n){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=x;++i){
            sum1+=i;
        }
        System.out.print(sum1);
        for(int i=x;i<=n;++i){
            sum2+=i;
        }
        if(sum1==sum2){
            return x;
        }else{
        x++;
        sum1=0;
        sum2=0;
        }}
        return -1;
    }
}