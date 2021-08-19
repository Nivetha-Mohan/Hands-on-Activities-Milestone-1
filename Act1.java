package Activity1;
import java.util.*;
public class Act1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);  
		int a[]=new int[25];  
		System.out.println("Enter the 25 numbers:");
		for(int i=0;i<25;i++)
		{
			a[i]=in.nextInt();
		}  
		int max=a[0];
		for(int i=0;i<25;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}  
		System.out.println("The maximum element is:");
		System.out.println(max);
		
	}

}
