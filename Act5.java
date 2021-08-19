package Activity1;
import java.util.*;
public class Act5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter n:");
		int n=sc.nextInt();  
		int arr[]=new int[n];
		System.out.println("Enter n numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		} 
		double sum=0.0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}  
		double avg=sum/n;  
		System.out.println("The average of the numbers are:");
		System.out.println(avg);

	}

}
