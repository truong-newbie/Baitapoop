package sinhvien;
import java.util.*;
public class Truong {
	private String ten;
	private String diaChi;
	private String hieuTruong;
	public Truong() {
		super();
	}
	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
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
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap thong tin truong hoc: ");
		System.out.println("Ten: ");
		this.ten=input.next();		
		System.out.println("Dia chi: ");
		this.diaChi=input.next();		
		System.out.println("Hieu truong: ");
		this.hieuTruong=input.next();		
	}
	@Override
	public String toString() {
		return "Truong [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	
}
