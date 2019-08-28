package arrray;
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		int arr[] = new int[10];
		System.out.println("Enter array elements ");
		for(int i=0;i<10;i++)
		{
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum is "+sum);
	}
}
