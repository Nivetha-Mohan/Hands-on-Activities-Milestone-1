package Activity1;
import java.util.*;
public class Act2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			a[i]=in.nextInt();
		} 
		int max=a[0];
		int count=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i]; 
			}
		}  
		for(int i=0;i<10;i++)
		{
			if(a[i]==max)
			{
				count++;
			}
		}
		System.out.println("The number of times the maximum element occurs in the array is:");
		System.out.println(count);
	}
}
