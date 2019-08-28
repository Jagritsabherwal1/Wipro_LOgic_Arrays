package arrray;

import java.util.Scanner;

public class first {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("Enter no. of elements..");
	n=s.nextInt();
	int arr[]=new int[n];
	int sum=0;
	System.out.println("Enter array elements..");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
		sum+=arr[i];
	}
	int count=0;
	int avg=sum/n;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<avg)
		{
			count++;
		}
	}
	System.out.println("Average is "+avg);
	System.out.println("No. less than average is "+count);
}
}
