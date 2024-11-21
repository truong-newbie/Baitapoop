package luonggiangvien;
import java.util.Scanner;
public class GiangVienTG extends GiangVien {
	protected int soTiet;
	protected int donGia;
	protected int thuNhap;
	public GiangVienTG() {
		super();
	}
	public GiangVienTG(String name, String adress, String type, int soTiet, int donGia, int thuNhap) {
		super(name, adress, type);
		this.soTiet = soTiet;
		this.donGia = donGia;
		this.thuNhap = thuNhap;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap vao so tiet ");
		this.soTiet= input.nextInt();
		System.out.println("Nhap vao don gia ");
		this.donGia= input.nextInt();
	}
	public double luong() {
		this.thuNhap = 15*(this.soTiet * this.donGia)/100;
		return this.soTiet*this.donGia-this.thuNhap;
	}
	
}