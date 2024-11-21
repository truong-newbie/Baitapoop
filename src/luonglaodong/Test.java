package luonglaodong;

public class Test {
	public static void main(String[] args) {
		KiSu n1 = new KiSu();
		System.out.println("Nhap vao thong tin ki su");
		n1.nhapTT();
		System.out.println("Nhap vao thong tin lao dong pho thong");
		LaoDongPhoThong n2 = new LaoDongPhoThong();
		n2.nhapTT();
		n1.inTT();
		n2.inTT();
}
}