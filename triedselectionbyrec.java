import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

	}
	public static void revselection(int[] arr, int r, int c){
	    if(r==0){
	        return;
	    }
	    int max = 0;
	    if(r<c){
	        if(max<arr[c]){
	            max = arr[c];
	        }
	        revselection(arr, r, c+1);
	    }else{
	        revselection(arr, r-1, 0);
	    }
	}
}
