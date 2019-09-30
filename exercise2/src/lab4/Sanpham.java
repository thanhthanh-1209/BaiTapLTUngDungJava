package lab4;
import java.util.Scanner;
public class Sanpham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	public  Sanpham(String tenSp,double donGia,double giamGia) {
		this.tenSp= tenSp;
		this.donGia= donGia;
		this.giamGia= giamGia;
	}
	public Sanpham(String tenSp, double donGia) {
		this.donGia=donGia;
		this.tenSp= tenSp;
	}
	public String gettenSp() {
		return tenSp;
		
	}
	public void settenSp (String tenSp) {
		this.tenSp = tenSp;
	}
	public double getdonGia() {
		return donGia;
	}
	public void setdonGia(double donGia) {
		this.donGia= donGia;
	}
	public double getgiamGia() {
		return giamGia;
	}
	public void setgiamGia(double giamGia) {
		this.giamGia= giamGia;
	}
	private double getThueNhapKhau() {
		return this.getdonGia()*0.1;
	}
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ten san pham");
		String tenSp= scan.nextLine();
		this.settenSp(tenSp);
		System.out.println("nhap don gia:");
		double donGia = scan.nextDouble();
		this.setdonGia(donGia);
		System.out.println("nhap ma giam gia:");
		double giamGia = scan.nextDouble();
		this.setdonGia(donGia);
		scan.close();
		
	}
	public void xuat() {
		System.out.println("ten san pham:"+this.gettenSp());
		System.out.println("don gia san pham:"+this.getdonGia());
		System.out.println("ma giam gia cua san pham:"+this.getgiamGia());
		System.out.println("thue nhap khau:"+this.getThueNhapKhau());
		
	}
	
	}

