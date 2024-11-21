package quanlinhanvien;
import java.util.*;
public class Employee extends Person{
	protected String employerName;
	protected String dateHired;
	public Employee() {
		super();
	}
	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name, age, gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		super.NhapTT();
		System.out.println("nhap ten employer");
		employerName= sc.nextLine();
		System.out.println("nhap ngay thue");
		dateHired= sc.nextLine();
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [employerName=" + employerName + ", dateHired=" + dateHired + "]";
	}
	

}
