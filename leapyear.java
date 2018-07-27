/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	int year = s.nextInt();
	boolean n = false;
	if(year % 400 == 0)
	{
            	n = true;
	}
	else if (year % 100 == 0)
	{
            	n = false;
	}
	else if(year % 4 == 0)
	{
            	n = true;
	}
	else
	{
            	n = false;
	}
	if(n)
	{
            	System.out.println("yes");
	}
	else
	{
            	System.out.println("no");
	}
    }
}
