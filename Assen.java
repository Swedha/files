import java.util.*;
class Assen
{
public static void main (String args[])
{

int a[],i,pass=1,n,t;
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
n=s.nextInt();
a=new int[n];
	for(i=0;i<n;i++)
	{
	System.out.println("enter the value for a["+i+"]");
	a[i]=s.nextInt();
	}
do
{
	for(i=0;i<=n-1-pass;i++)
	{
		if (a[i]>a[i+1])
		{
		t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
		}
}
pass ++;
}
while (pass<=n-1);
{
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}
}
}
}
