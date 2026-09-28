class Solution {
    public boolean isPowerOfFour(int n) {
        int result  = 1;
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        if(result == n){
            return true;
        }
        if(n%4==0){
            result = result * 4;
        }
        return isPowerOfFour(n/4);

    }
}
