import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	trianglerev(4);
	}
	public static  void trianglerev(int row){
	    if(row<1){
	        return;
	    }
	    int col = 0;
	    while(col<row){
	        System.out.print("*");
	        col++;
	    }
	    System.out.println();
	    trianglerev(row-1);
	}
}
