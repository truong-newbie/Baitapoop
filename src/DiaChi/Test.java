package DiaChi;

public class Test {
	public static void main(String [] args) {
		Address a1 = new Address();
		
		//gan gia tri 
		a1.setThon("4");
		a1.setXa("Canh nau");
		a1.setHuyen("Thach That");
		a1.setTinh("Ha noi");
		
		//xuat du lieu
		System.out.println("Thon: " + a1.getThon());
		System.out.println("Phuong/Xa: " + a1.getXa());
		System.out.println("Quan/Huyen: " + a1.getHuyen());
		System.out.println("Tinh/Thanh Pho: " + a1.getTinh());
		//xuat du lieu 
		System.out.println(a1.toString());
	}
}
