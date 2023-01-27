class Solution {
    public boolean isPowerOfFour(int n) {
       boolean res=false;
        if(n==1){
            return true;
        }
        if(n>0 && n%4==0){
            res=isPowerOfFour(n/4);
        }
        return res;
    }
}