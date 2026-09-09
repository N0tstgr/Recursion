import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = {1,2,4,3,6,5};
	revbubble(arr,arr.length-1,0);
	System.out.println(Arrays.toString(arr));

	}
	public static void revbubble(int[] arr, int r, int c){
	    if(r==0){
	        return;
	    }
	    if(c<r){
	        if(arr[c]>arr[c+1])
	         swap(arr,c,c+1);
	        revbubble(arr, r, c+1);
	       
	    }else{
	        revbubble(arr,r-1,0);
	    }
	    
	}
	
	public static void swap(int[] arr, int first, int second){
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
}
