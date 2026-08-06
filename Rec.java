import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int[] arr = {1,2,3,4,66,89,90};
	 int target = 90;
	 System.out.println(search(arr,target,0,arr.length-1));
	}
	
	   static int search(int[] arr, int target, int e, int s){
	   if(s>e){
	       return -1;
	   }
	   int m = s + (e-s)/2;
	   if(arr[m]==target){
	       return m;
	   }
	   if(target<arr[m]){
	       return search(arr,target, s , m-1);
	   }
	   return search(arr, target, m+1, e);
	    }
}
