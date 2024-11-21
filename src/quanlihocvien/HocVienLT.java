
package quanlihocvien;

import java.util.Scanner;
public class HocVienLT extends Hocvien {
	protected int soBuoi;
	protected int donGia;
	protected int uuTien;
	
	
	public HocVienLT() {
		
	}
	

	public HocVienLT(String hoTen, String diaChi, String chuongTrinh, int loaiUT, int soBuoi, int donGia, int uuTien) {
		super(hoTen, diaChi, chuongTrinh, loaiUT);
		this.soBuoi=soBuoi;
		this.donGia=donGia;
		this.uuTien=uuTien;
	}


	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so buoi: ");
		this.soBuoi=input.nextInt();
		
		System.out.println("Nhap don gia: ");
		this.donGia= input.nextInt();		
	}
	@Override
	public int hocPhi() {
		if(this.loaiUT==1)
			this.uuTien=1000000;
		else if(this.loaiUT ==2)
			this.uuTien=800000;
		return this.soBuoi * this.donGia -this.uuTien;
	}


}
