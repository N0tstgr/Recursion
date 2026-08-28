package RecursionLevel1;

public class productofdigit {
    public static void main(String[] args) {
        System.out.println(pD(13420));
    }
    public static int pD(int n ){
//        int sum = 0;
        if(n%10==n){
            return n;
        }
        return (n%10)*pD(n/10);
    }
}
