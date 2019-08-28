package arrray;

import java.util.Scanner;

public class fifth {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("Enter size of array..");
	n=s.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	
	for(int i=1;i<=100;i++)
	{
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]==i)
			{
				count++;
			}
		}
		if(count>0)
		System.out.println("Students scored "+i+" marks are "+count);
	}
}
}
