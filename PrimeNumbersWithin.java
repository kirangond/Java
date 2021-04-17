import java.util.Scanner;
class PrimeNumbersWithin
{

static boolean isPalindrome(int n)
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}



public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

int m=sc.nextInt();
int n=sc.nextInt();



for(int i=m;i<n;i++)
{
boolean rs=isPalindrome(i);
if(rs)
{
System.out.println(i);
}
}

}






}














