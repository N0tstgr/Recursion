import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
// 		 reverse(4565);
        System.out.println(rev2(4562));

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
    public static int rev2(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem *(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
    
}
