package exercise2;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap ho ten va diem trung binh cua hoc sinh:");
		System.out.println("nhap ho va ten:");
		Scanner scanner = new Scanner(System.in);
		String hoTen;
		hoTen = scanner.nextLine();
		System.out.println("hoTen"+hoTen);
		System.out.println("nhap diemTB:");
		double diemTB;
		diemTB = scanner.nextDouble();
		System.out.println("diemTB"+diemTB);
		scanner.close();
	}

}
