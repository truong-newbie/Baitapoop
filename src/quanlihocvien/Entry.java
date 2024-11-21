package quanlihocvien;

import java.util.Scanner;
public class Entry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("So HVDH: ");
		int n= input.nextInt();
		HocVienDH d[] = new HocVienDH[n];
		
		for(int i=0;i<d.length;i++) {
			d[i]= new HocVienDH();
			d[i].nhapTT();
		}
		
		
		System.out.println("So HVLT:");
		int m = input.nextInt();
		HocVienLT l[]= new HocVienLT[m];
		for(int i=0;i<l.length;i++) {
			l[i]= new HocVienLT();
			l[i].nhapTT();
		}
		for(int i=0;i<d.length;i++) {
			d[i].inTT();
		}
		for(int i=0;i<l.length;i++) 
			l[i].inTT();
		
	}
}