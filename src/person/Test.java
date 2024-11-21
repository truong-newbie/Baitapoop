package person;

public class Test {
	public static void main(String [] args) {
		//khoi tao doi tuong
		Person p1 = new Person();
		//thiet lap gia tri
		p1.setName("Truong");
		p1.setDob("3/12/2005");
		p1.setPob("Ha Noi");
		p1.setGender('M');
		p1.setEmail("dangtruong3122005@gmail.com");
		p1.setPhone("0123456789");
		//lay gia tri
		System.out.println("Name :"+p1.getName());
		System.out.println("birthday:"+p1.getDob());
		System.out.println("place :"+ p1.getPob());
		System.out.println("gender:"+ p1.getGender());
		System.out.println("Email:"+ p1.getEmail());
		System.out.println("Phonenumber:"+ p1.getPhone());
		//xuat du lieu
		System.out.println(p1.toString());
		
		
		
		
	}
}
