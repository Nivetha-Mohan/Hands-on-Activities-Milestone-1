package Activity1;
import java.util.*;
public class Act14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("The first number is:");
		int n1=sc.nextInt();//n1=43
		System.out.println("The second number is:");
		int n2=sc.nextInt(); //n2=91
		System.out.println("The third number is:");
		int n3=sc.nextInt();//n3=183
		int gcd=Act14.findGCD(n1,n2,n3);
		System.out.println("The number is:");
		System.out.println(gcd);
		sc.close();

	} 
	public static int findGCD(int x,int y)
	{
		if(y==0)
		{
			return x;
		} 
		else
		{
			return findGCD(y,x%y);
		}
	} 
	public static int findGCD(int x,int y,int z)
	{
		return findGCD(findGCD(x,y),z);
	}
}
