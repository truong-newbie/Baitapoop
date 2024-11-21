package quanlinhanvien;
import java.util.*;
public class Test {
	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int n = input.nextInt();
		PartimeEmployee pt[] = new PartimeEmployee[n];
		for(int i=0; i<pt.length; i++)
			pt[i] = new PartimeEmployee();
		for(int i=0; i<pt.length;i++) {
			System.out.println("Nhap thong tin nhan vien " + (i+1) + ": ");
			pt[i].NhapTT();
		}		
		for(int i=0; i<pt.length; i++)
			System.out.println(pt[i].toString());
	}
}
