package loops;

public class third {
	public static void main(String args[])
	{
		int a=12341;
		int rem;
		int sum=0;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println(sum);
	}
}
