package RecursionLevel1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfD(1342));
    }
    public static int sumOfD(int n ){
        int sum = 0;
        if(n==0){
            return;
        }
        return sum+sumOfD(n%10);
    }
}
