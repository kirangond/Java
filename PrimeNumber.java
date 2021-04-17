import java.util.Scanner;
class PrimeNumber
{
static boolean isPrime(int n)
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
return false;
}
return true;
}



public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

boolean rs=isPrime(n);
if(rs==true)
{
System.out.println("prime number");
}
else
{
System.out.println("not prime number");
}



}
}



/*
int count=0;
/*for(int i=2;i<=n/2;i++)
{
  if(n%i==0)
{
count++;
}
}

if(count>0)
{
System.out.println("not prime number");
}
else
{
System.out.println("prime number");
}
*/