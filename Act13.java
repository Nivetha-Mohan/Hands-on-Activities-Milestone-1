package Activity1;
import java.util.*;
public class Act13 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int length,breadth,diff=23,perimeter=206,area; 
		int s=perimeter/2;
		length=(s+diff)/2;
		breadth=length-diff;
		area=length*breadth; 
		System.out.println("The area is:");
		System.out.println(area);
	}
}