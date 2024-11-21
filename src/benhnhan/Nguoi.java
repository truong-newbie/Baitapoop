package benhnhan;
import java.util.*;
public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	public Nguoi() {
		
	}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ten:");
		this.ten=sc.nextLine();
		System.out.println("nhap tuoi");
		this.tuoi= sc.nextInt();
		System.out.println("nhap gioi tinh");
		this.gioiTinh= sc.next().charAt(0);
	}
	
}
