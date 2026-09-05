import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int target = 3;
		int[] arr = { 1,2,3,3,3,4,5};
		findAllIndex(arr,target,0);
		System.out.println(list);
	}
	static ArrayList<Integer> list = new ArrayList<>();
	static void findAllIndex(int[] arr, int target, int index){
	    if(index==arr.length){
	        return;
	    }
	    if(arr[index] == target){
	        list.add(index);
	    }
	    findAllIndex(arr, target, index+1);
	}
}
