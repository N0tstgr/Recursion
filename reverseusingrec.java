package RecursionLevel1;

public class ReversingNumber {
    public static void main(String[] args) {
        reverse(4565);
        System.out.println(rev);
    }
    static int rev  = 0;
    public static void reverse(int n){
        int rem = 0;
        if(n==0){
            return;
        }
        rem = n%10;
        rev = rev *10 + rem;
          reverse(n/10);
    }
}
