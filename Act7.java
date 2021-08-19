package Activity1;
import java.util.*;
public class Act7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter speed of the train:");
		int x=sc.nextInt(); 
		System.out.println("Enter the time taken to cross the pole:"); 
		int y=sc.nextInt(); 
		x=x*1000;
		float s=(float)x/(float)3600; 
		float dist =s*y;  
		System.out.println("Length of the train is:");
		System.out.println(dist);
		
		
      
	}
}
