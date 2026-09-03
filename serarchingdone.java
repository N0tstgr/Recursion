import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int target = 1;
	    int[] nums = {1,1,2,6,4,5};
	    System.out.println(indexLast(nums, target, nums.length-1));
	    
         	}
         	static boolean sh(int[] nums,  int target , int index){
         	    if(index==nums.length){
         	        return false;
         	    }
         	    return  (nums[index]== target || sh(nums, target, index+ 1));
         	}
         	
         	 static int index1(int[] nums,  int target , int index){
         	    if(index==nums.length){
         	        return -1;
         	    }
         	    if (nums[index]== target ){
         	        return index;
         	    }
         	    return  index1(nums, target, index+ 1);
         	}
         	
         	
         	 static int indexLast(int[] nums,  int target , int index){
         	    if(index<0){
         	        return -1;
         	    }
         	    if (nums[index]== target ){
         	        return index;
         	    }
         	    return  indexLast(nums, target, index-1);
         	}
}
