import java.util.*;
class Table
{
public static void main(String args[])
{
int i,n;
System.out.println("enter the number to print its multiplication table");
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.println("multiplication table of"+n+"is: ");
for(i=1;i<=10;i++)
System.out.println(n+"*"+i+"="+(n*i));
}
}