package arrray;

import java.util.Scanner;

public class fourth {
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
	int j=n-1;
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr1[i]=arr[j];
		j--;
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(arr1[i]);
	}
}
}
