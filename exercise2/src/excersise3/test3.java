package excersise3;
import java.util.Scanner;

public class test3 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int soDien;
		soDien = scan.nextInt();
		int tienDien;
		if (soDien < 50) {
			tienDien = soDien * 1000;
			System.out.println("tien dien:" + tienDien);
		} else {
			tienDien = + (50 * 1000 + (soDien - 50) * 1200);
			System.out.println("tien dien: " + tienDien);
			scan.close();
		}
	}
}
