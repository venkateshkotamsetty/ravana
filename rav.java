/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		
		
	 int x, y, z;
        Scanner s = new Scanner(System.in);
        
        x = s.nextInt();
       
        y = s.nextInt();
        
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println(+x);
        }
        else if(y > z)
        {
            System.out.println(+y);
        }
        else
        {
            System.out.println(+z);
        }
}
	
}
