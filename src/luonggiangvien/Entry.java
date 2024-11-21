package luonggiangvien;

import java.util.Scanner;
public class Entry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("So GVTG: ");
		int n= input.nextInt();
		GiangVienTG d[] = new GiangVienTG[n];
		
		for(int i=0;i<d.length;i++) {
			d[i]= new GiangVienTG();
			d[i].nhapTT();
		}
		
		
		System.out.println("So GVCH:");
		int m = input.nextInt();
		GiangVienCH l[]= new GiangVienCH[m];
		for(int i=0;i<l.length;i++) {
			l[i]= new GiangVienCH();
			l[i].nhapTT();
		}
		for(int i=0;i<d.length;i++) {
			d[i].inTT();
		}
		for(int i=0;i<l.length;i++) 
			l[i].inTT();
		
	}
}