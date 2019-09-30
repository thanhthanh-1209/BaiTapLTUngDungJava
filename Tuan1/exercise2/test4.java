package exercise2;
import java.util.Scanner;
public class test4 {
	public static void main (String[]args)
	{
		System.out.println("tinh can delta:");
		float a,b,c,x1,x2;
		double delta;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap a:");
		a = scan.nextFloat();
		System.out.println("nhap b:");
		b =scan.nextFloat();
		System.out.println("nhap c:");
		c =scan.nextFloat();
		System.out.println("delta:");
		delta = Math.pow(b,2) + 4*a*c;
        x1 = ((-b +(float) Math.sqrt(delta))/ 2*a);
        x2 = ((-b -(float) Math.sqrt(delta))/ 2*a);
        System.out.println("nghiem thu nhat la:"+x1 );
        System.out.println("nghiem thu hai la:"+x2 );
        scan.close();
	}

}
