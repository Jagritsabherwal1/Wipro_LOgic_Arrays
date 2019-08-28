package arrray;

import java.util.Scanner;

public class third {
public static void main(String args[])
{
	int max=Integer.MIN_VALUE;
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;

	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("Enter size of array..");
	n=s.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
		
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Maximum is "+max);
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max1 && arr[i]<max)
		{
			max1=arr[i];
		}
	}
	System.out.println("Second maximum is "+max1);
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max2 && arr[i]<max1)
		{
			max2=arr[i];
		}
	}
	System.out.println("Third maximum is "+max2);
	
	int min=Integer.MAX_VALUE;
	int min1=Integer.MAX_VALUE;
	int min2=Integer.MAX_VALUE;
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println("Minimum is "+min);
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min1 && arr[i]>min)
		{
			min1=arr[i];
		}
	}
	System.out.println("Second Minimum is "+min1);
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min2 && arr[i]>min1)
		{
			min2=arr[i];
		}
	}
	System.out.println("Third Minimum is "+min2);
	
	
}
}
