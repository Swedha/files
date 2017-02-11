import java.util.Scanner;
class Multiplication
{

public static void main(String args[])
{
int n,i,c;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("enter the number"+n);

for(i=1;i<=10;i++)
{
c=n*i;
System.out.println(n+ "*"+i+"="+c);
}
}
}

