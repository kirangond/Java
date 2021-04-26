public class ArrayRotation
{
    
    static void rotate(int arr[],int d,int n)
    {
        for(int j=0;j<d;j++)
        {
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
          
            arr[i]=arr[i+1];
        }
         arr[n-1]=temp;
        }
         for(int i=0;i<n;i++)
         {
             System.out.println(arr[i]);
         }
        
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5},d=4,n=5;
		rotate(arr,d,n);
		
	}
}