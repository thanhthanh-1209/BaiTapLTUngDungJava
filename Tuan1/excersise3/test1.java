package excersise3;
import java.util.Scanner;
public class test1 {

	public static void main (String[] args) {
		
		// TODO Auto-generated method stub
		
		 float a,b,x;
	        System.out.println("phuong trinh bac 1");
	        Scanner scan= new Scanner(System.in);
	        System.out.println(" so a:");
	        a=scan.nextFloat();
	        System.out.println(" so b:");
	        b=scan.nextFloat();
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
	       
	        scan.close();
	}
	
}

	
