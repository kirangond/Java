class SmallestElementInArray
{
public static void main(String args[])
{
int arr[]={10,30,25,20,5},n=5;
int small=arr[0];
for(int i=1;i<n;i++)
{
  if(small>arr[i])
     small=arr[i];
}
System.out.println("smallest element is"+small);
}
}