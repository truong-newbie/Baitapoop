package luonglaodong;
import java.util.Scanner;
public abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLaoDong;
	public NguoiLaoDong() {
		
	}
	public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiLaoDong() {
		return loaiLaoDong;
	}
	public void setLoaiLaoDong(String loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		this.hoTen=input.next();
		
		System.out.println("Nhap dia chi:");
		this.diaChi=input.next();
		
		System.out.println("Nhap loai lao dong:");
		this.loaiLaoDong=input.next();
	}
	public abstract double tinhLuong();
	
	public void inTT() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Dia chi: " + this.diaChi);
		System.out.println("Loai lao dong: " + this.loaiLaoDong);
		System.out.printf("Luong thang: %.2f\n " , this.tinhLuong());
	}
}