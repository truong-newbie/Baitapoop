package quanlinhanvien;
import java.util.*;
public class PartimeEmployee extends Employee {
	protected int hoursPerWeek;

	public PartimeEmployee() {
		super();
	}

	public PartimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hourPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHourPerWeek() {
		return hoursPerWeek;
	}

	public void setHourPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		super.NhapTT();
		System.out.println("nhap so gio lam moi tuan");
		hoursPerWeek= sc.nextInt();
	}
	@Override
	public String toString() {
		return super.toString()+"PartimeEmployee [hourPerWeek=" + hoursPerWeek + "]";
	}
	
	
}
