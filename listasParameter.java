import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int target = 3;
		int[] arr = { 1,2,3,3,3,4,5};
ArrayList<Integer> list = new ArrayList<>();
ArrayList<Integer> ans = findAllIndex(arr, 3, 0, list);
System.out.println(ans);
System.out.println(list);
	}
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index , ArrayList<Integer> list){
	    if(index==arr.length){
	        return list;
	    }
	    if(arr[index] == target){
	        list.add(index);
	    }
	     return findAllIndex(arr, target, index+1, list);
	}
}
