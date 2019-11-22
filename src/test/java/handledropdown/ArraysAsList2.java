package handledropdown;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList2 {

	public static void main(String[] args) 
	{

int []a = {1,3,5,45,76,23,89};


System.out.println(getSecondLargestNum(a,7));


				
				
								
				
	}
	
	
	
	
	public static int getSecondLargestNum(int []a,int total)
	{
		
		
		
		Arrays.sort(a);
		return a[total-2];
	}

}
