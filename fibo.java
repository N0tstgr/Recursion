package RecursionLevel1;

public class Fibo {

    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
    public static int  fib(int n){
        if(n==0){
            return 1;
        }
         return n * fib(n-1);
    }
}
