package luonglaodong;

import java.util.Scanner;
public class KiSu  extends NguoiLaoDong {
	
	protected double luongCB;
	protected double hsLuong;
	protected double thuong;
	protected int soNC;
	
	public KiSu() {
		
	}

	public KiSu(String hoTen, String diaChi, String loaiLaoDong, double luongCB, double hsLuong, double thuong, int soNC) {
		super(hoTen, diaChi, loaiLaoDong);
		this.luongCB=luongCB;
		this.hsLuong=hsLuong;
		this.thuong=thuong;
		this.soNC=soNC;
		
	}
	
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap luong co ban: ");
		this.luongCB=input.nextDouble();
		
		System.out.println("Nhap he so luong: ");
		this.hsLuong=input.nextDouble();
		
		System.out.println("Nhap so ngay cong: ");
		this.soNC=input.nextInt();
		
		
		
	}
	@Override
	public double tinhLuong() {
		if(this.soNC>=25)
			this.thuong=2000000;
		else if(this.soNC>15)
			this.thuong=1000000;
		else 
			this.thuong=500000;
		
		return this.luongCB *this.hsLuong + this.thuong;
	}
	
	
	@Override
	public void inTT() {
		super.inTT();
		System.out.printf("Luong co ban:%.2f\n" , this.luongCB);
		System.out.println("He so luong: " +this.hsLuong);
		System.out.println("Thuong: " +this.thuong);
	}
	

}