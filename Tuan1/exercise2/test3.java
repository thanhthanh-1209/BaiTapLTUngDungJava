package exercise2;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tinh the tich khoi lap phuong:");
		float canh;
		double thetichKLP;
		Scanner scan = new Scanner(System.in);
		System.out.println("canh la:");
		canh = scan.nextFloat();
		thetichKLP = Math.pow(canh,3);
		System.out.println("the tich khoi lap phuong la:"+thetichKLP);
		scan.close();

	}

}
