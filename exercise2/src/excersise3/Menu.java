package excersise3;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("^^^^Menu^^^^");
		System.out.println("1.Tinh phuong trinh bac 1");
		System.out.println("2.Tinh phuong trinh bac 2");
		System.out.println("3.Tinh tien dien");
		System.out.println("4.Thoat");
		
		int answer = 0;
		System.out.println("lua chon cua ban:");
		Scanner scan = new Scanner(System.in);
		answer = scan.nextInt();
		
		
		switch (answer) {
		case 1:
		{
			float a,b,x;
			System.out.print("nhap so a:");
			 a = scan.nextFloat();
			System.out.println("nhap so b:");
			 b = scan.nextFloat();
		        if(a==0)
		        {
		            if(b==0)
		            {
		                System.out.println("phuong trinh vo so nghiem:");
		            }
		            else
		            {
		                System.out.println("phuong trinh vo nghiem:");
		            }
		        } 
		        else
		        {
		            if(b==0)
		            {
		                System.out.println("phuong trinh co nghiem la x=0");
		            }
		            else
		            {
		                System.out.println("phuong trinh co nghiem la:"+( x=-b/a));
		            }
		        }
			
			break;
		}
		case 2:
		{
			float a,b,c,delta,x1,x2;
			System.out.println("nhap so a:");
			 a = scan.nextFloat();
			System.out.println("nhap so b:");
			 b = scan.nextFloat();
			System.out.println("nhap so c:");
			 c = scan.nextFloat();
			 if (a == 0) {
					if (b == 0) {
						System.out.println("phuong trinh vo nghiem");
					} else {
						System.out.println("phuong trinh co 1 nghiem: " + "x = " + (-c / b));
					}
				}
				
				 delta = b * b - 4 * a * c;
				
				
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
				break;
			}
			
			
		
		case 3:
		{
			System.out.println("nhap so tien dien:");
			int soDien = scan.nextInt();
			int tienDien;
			if (soDien < 50) {
				tienDien = soDien * 1000;
				System.out.println("tien dien:" + tienDien);
			} else {
				tienDien = + (50 * 1000 + (soDien - 50) * 1200);
				System.out.println("tien dien: " + tienDien);
				scan.close();
				break;
			}
		}
			break;
		
			
			
			default:
				System.out.println("Thoat");
				break;
				
			}
			
		
	
		

		}
	}

