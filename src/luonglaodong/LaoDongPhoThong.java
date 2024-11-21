package luonglaodong;

import java.util.Scanner;
public class LaoDongPhoThong extends NguoiLaoDong {
	protected int soNC;
	protected double donGiaNC;
	protected double thuong;
	public LaoDongPhoThong() {
		
	}
	public LaoDongPhoThong(String hoTen, String diaChi, String loaiLaoDong, int soNC, double donGiaNC, double thuong) {
		super(hoTen, diaChi, loaiLaoDong);
		this.soNC=soNC;
		this.donGiaNC=donGiaNC;
		this.thuong=thuong;
		
	}
	
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("So ngay cong: ");
		this.soNC=input.nextInt();
		
		System.out.println("Don gia ngay cong: ");
		this.donGiaNC=input.nextDouble();
	}
		@Override 
	public double tinhLuong() {
		if(this.soNC>=25)
			this.thuong=1000000;
		else if(this.soNC>15)
			this.thuong=700000;
		else 
			this.thuong=0;
		
		return this.soNC*this.donGiaNC + this.thuong;
	}
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("So ngay cong: "+ this.soNC);
		System.out.println("DOn gia ngay cong: " + this.donGiaNC);
		System.out.println("Thuong: " + this.thuong);
	}

	
	
}