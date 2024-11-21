package luonggiangvien;

import java.util.Scanner;
public class GiangVienCH extends GiangVien {
	protected int lcb;
	protected int heSo;
	protected int phuCap;
	protected int thamNien;
	public GiangVienCH() {
		super();
	}
	public GiangVienCH(String name, String adress, String type, int lcb, int heSo, int phuCap,int thamNien) {
		super(name, adress, type);
		this.lcb=lcb;
		this.heSo=heSo;
		this.phuCap=phuCap;
		this.thamNien=thamNien;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap vao luong co ban ");
		this.lcb= input.nextInt();
		System.out.println("Nhap vao he so luong ");
		this.heSo= input.nextInt();
		System.out.println("Nhap vao tham nien ");
		this.thamNien= input.nextInt();
	}
	public double luong() {
		if(this.thamNien>5) {
			this.phuCap = this.thamNien * this.lcb / 100;
		}
		else this.phuCap = 0;
		return this.lcb*this.heSo + this.phuCap;
	}	
	
}