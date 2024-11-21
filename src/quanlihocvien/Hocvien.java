package quanlihocvien;
import java.util.Scanner;
public abstract class Hocvien {
	protected String hoTen;
	protected String diaChi;
	protected String chuongTrinh;
	protected int loaiUT;
	public Hocvien() {
	}
	public Hocvien(String hoTen, String diaChi, String chuongTrinh, int loaiUT) {
		
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.chuongTrinh = chuongTrinh;
		this.loaiUT = loaiUT;
	}
	public abstract int hocPhi();
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.hoTen=input.next();
		
		System.out.println("Nhap dia chi: ");
		this.diaChi=input.next();
		
		System.out.println("Nhap loai chuong trinh: ");
		this.chuongTrinh=input.next();
		
		System.out.println("Nhap  loai uu tien: ");
		this.loaiUT=input.nextInt();
		
	}
	public void inTT() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Dia chi: " + this.diaChi);
		System.out.println("Loai uu tien: " + this.loaiUT);
		System.out.println("Loai chuong trinh: " + this.chuongTrinh);
		System.out.println("Hoc phi: " + this.hocPhi());
	}
}