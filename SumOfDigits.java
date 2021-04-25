import java.util.Scanner;
class SumOfDigits
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,r;
while(n>0)
{
r=n%10;
sum+=r;
n=n/10;
}

System.out.println(sum);


}
}