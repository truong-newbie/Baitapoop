package luonggiangvien;
import java.util.Scanner;
public abstract class GiangVien {
	protected String name;
	protected String adress;
	protected String type;
	public GiangVien() {
	}
	public GiangVien(String name, String adress, String type) {
		this.name=name;
		this.adress=adress;
		this.type=type;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.name=input.next();
		
		System.out.println("Nhap dia chi: ");
		this.adress=input.next();
	}
	public abstract double luong();
	public void inTT() {
		System.out.println("Ho ten: " + this.name);
		System.out.println("Dia chi: " + this.adress);
		if (this instanceof GiangVienTG) {
			System.out.println("Giang vien thinh giang");
		}
		else 
			System.out.println("Giang vien co huu");
		System.out.println("Luong: " + this.luong());
	}
}