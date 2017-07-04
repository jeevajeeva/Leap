# Leap
import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if((a%4==0)||(a%400==0))
{
System.out.println("this is a Leap year");
}
else
{
System.out.println("this not Leap year");
}
}
}
