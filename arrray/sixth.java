package arrray;

import java.util.Scanner;

public class sixth {
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

		for(int i=1;i<=100;i=i+10)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
			    if(i<=arr[j] && arr[j]<i+10)
			    {
			    	count++;
			    }
			}
			if(count>0)
			{
				int m=i+9;
				System.out.println("No. of students having marks between "+i+" & "+m+" is "+count);
			}
		}
	}
}
