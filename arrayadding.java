import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n,count=0,i,k;
	    int a[]=new int[50];
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    k=sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for(i=0;i<k;i++)
	    {
	    	count=a[i]+count;
	    }
	    System.out.println(count);
	    	
	    
	}
}
