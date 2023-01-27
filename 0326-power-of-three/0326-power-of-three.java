class Solution {
    public boolean isPowerOfThree(int n) {
       boolean res=false;
        if(n==1){
            return true;
        }
        if(n>0 && n%3==0){
            res=isPowerOfThree(n/3);
        }
        return res;
    }
}