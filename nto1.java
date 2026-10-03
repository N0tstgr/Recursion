package RecursionPractice;

public class oneton {
    public static void main(String[] args) {
        OneTon(5);
    }
    public static void OneTon(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        OneTon(n-1);
    }
}
