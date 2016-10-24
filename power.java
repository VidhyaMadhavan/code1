import java.io.*;
import java.util.*;
import java.math.*;
class power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double n,sum=0,p;
System.out.println("Enter number:");
n=sc.nextInt();
System.out.println("Enter power");
p=sc.nextInt();
sum=Math.pow(n,p);
System.out.println("The power of given number is:"+sum);
}
}
