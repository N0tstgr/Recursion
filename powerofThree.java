class Solution {
    public boolean isPowerOfThree(int n) {
        int result  =1;
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(result==n){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        if(n%3==0){
            result = result * 3;
        }
        return isPowerOfThree(n/3);
        
    }
}
