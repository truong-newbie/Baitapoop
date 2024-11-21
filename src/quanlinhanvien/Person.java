package quanlinhanvien;
import java.util.Scanner;
public class Person {
	protected String name;
	protected int age;
	protected char gender;
	public Person() {
		super();
	}
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ten:");
		name= sc.nextLine();
		System.out.println("nhap tuoi");
		age= sc.nextInt();
		System.out.println("nhap gioi tinh");
		gender= sc.next(). charAt(0);
		}
}
