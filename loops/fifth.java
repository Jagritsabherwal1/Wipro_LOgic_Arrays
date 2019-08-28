package loops;

import java.util.Scanner;

public class fifth {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int i=2;
	while(a%i!=0)
	{
		i++;
	}
	System.out.println(i);
}
}
