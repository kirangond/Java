import java.util.Scanner;
class ThreeDigitsPalindrome
{
static boolean isPalindrome(int n)
{
int sum=0,r,temp=n;
 do
{
 r=n%10;
 sum=sum*10+r;
 n=n/10;
}while(n!=0);

return (sum==temp);
}

public static void main(String args[])
{

//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();

for(int i=100;i<=999;i++)
{
boolean bs=isPalindrome(i);
if(bs)
{
 System.out.println(i);
}
}

}
}


/*
for(int i=1;i<=9;i++)
{
for(int j=0;j<=9;j++)
{
 System.out.println(i+""+j+""+i);

}
}

*/
