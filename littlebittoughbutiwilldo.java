import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			public static void main (String[] args) throws java.lang.Exception
	{
	trianglerev(4,0);
	}
	public static  void trianglerev(int row, int col){
	    if(row<1){
	        return;
	    }
	    if(col<row){
	        trianglerev(row, col+1);
	        System.out.print("*");
	        
	    }
	   
	    trianglerev(row-1,0);
	     System.out.println();
	}

	}
}
