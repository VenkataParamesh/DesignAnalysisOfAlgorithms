import java.util.Scanner;
public class fibonacci {
public static void main(String args[])
{
	int a[]=new int[10];
	a[0]=0;
	a[1]=1;
	System.out.print("Fibonacci series done in Dynamic programming is :");
	System.out.print(a[0]+",");
    System.out.print(a[1]+",");
	for(int i=2;i<10;i++)
	{
		a[i]=a[i-1]+a[i-2];
		if(i==9)
		{
			System.out.print(a[i]+".");
		}
		else
		{
		System.out.print(a[i]+",");
		}
	}
}
}
