import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int target = 8;
	    int[] nums = {1,2,6,4,5};
	    System.out.println(sh(nums, target, 0));
	    
         	}
         	static boolean sh(int[] nums,  int target , int index){
         	    if(nums[index]==target){
         	        return true;
         	    }
         	    return  sh(nums, target,  index+1);
         	}
}
