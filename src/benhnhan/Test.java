package benhnhan;

public class Test {
	BenhVien p1 =new BenhVien();
	p1.NhapTT();
	BenhNhan n1 = new BenhNhan();
	n1.NhapTT();
	n1.setBenhVien(p1);
	System.out.println(n1.toString());
}
