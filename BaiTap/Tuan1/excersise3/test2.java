package excersise3;

import java.util.Scanner;

public class test2 {
	public static void main (String []args) {
		float a;
		float b;
		float c;
		Scanner scan = new Scanner (System.in);
		System.out.println("nhap so a:");
		a = scan.nextFloat();
		System.out.println("nhap so b:");
		b =scan.nextFloat();
		System.out.println("nhap so c:");
		c= scan.nextFloat();
		if (a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo nghiem");
			} else {
				System.out.println("phuong trinh co 1 nghiem: " + "x = " + (-c / b));
			}
		}
		
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("phuong trinh co 2 nghiem: " + "x1 = " + x1 + " v� x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("phuong trinh c� nghiem kep: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("phuong trinh vo nghiem");
		}
		scan.close();

	}
}