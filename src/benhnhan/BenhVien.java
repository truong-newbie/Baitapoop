package benhnhan;
import java.util.*;
public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;
	public BenhVien() {
		super();
	}
	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ten:");
		ten= sc.nextLine();
		System.out.println("nhap dia chi");
		diaChi= sc.nextLine();
		System.out.println("nhap ten giam doc");
		giamDoc= sc.nextLine();
	}
	
}
