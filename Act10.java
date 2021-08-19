package Activity1;
import java.util.*;
public class Act10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=21;i<=(int)Math.pow(2,21);i++)
		{
			int squrt=(int)Math.sqrt(i);
			if((squrt*squrt==i)&&(i%21==0&&i%36==0&&i%66==0))
			{
				System.out.println("The number is:");
				System.out.println(i);
				break;
			}
		}

	}
}
