package exercise2;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tinh chu vi dien tich va canh nho nhat cua HCN");
		Scanner scan = new Scanner(System.in);
		
		float dai;
		float rong;
		float chuvi;
		float dientich;
		float canhnhonhat;
		
		System.out.println("chieu dai la:");
		dai = scan.nextFloat();
		System.out.println("chieu rong la:");
		rong = scan.nextFloat();
		
		chuvi = (dai+rong)*2;
		
		dientich = dai*rong;
		canhnhonhat = Math.min(dai, rong);
		System.out.println("chuvi:"+chuvi);
		System.out.println("dientich:"+dientich);
		System.out.println("canhnhonhat:"+ canhnhonhat);
		scan.close();

	}

}
