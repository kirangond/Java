import java.util.Scanner;
class Number20
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sp=n/2,sn=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=sp;j++)
{
System.out.print("  ");
}
int k=1;
for(int j=1;j<=sn;j++)
{
System.out.print(k%2+" ");
k++;
}


if(i<=n/2)
{
sp--;
sn=sn+2;
}
else
{
sp++;
sn=sn-2;
}

System.out.println();

}

}
}