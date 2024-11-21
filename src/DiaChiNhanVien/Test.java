package DiaChiNhanVien;

public class Test {
	public static void main(String [] args) {
		DiaChi dc= new DiaChi("4", "canh nau", " thach that", " ha noi");
		NhanVien nv = new NhanVien("Truong", dc, "3/12/2005", 'M');
		System.out.println(nv.toString());

	}
}
