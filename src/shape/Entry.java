package shape;
import java.util.Scanner;
public class Entry {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("Nhap so luong hcn: ");
		int n = input.nextInt();
		Rectangle r[]= new Rectangle[n];		
		for(int i=0;i<r.length;i++)
			r[i]= new Rectangle();
		for(int i=0; i<r.length;i++) {
			System.out.println("Nhap thong tin hcn " +(i+1));
			r[i].nhapTT();
		}	
		System.out.println("Nhap so tam giac: ");
		int m = input.nextInt();
		Triangle t[] = new Triangle [m];		
		for(int i=0;i<t.length;i++)
			t[i]=new Triangle();	
		for(int i=0;i<t.length;i++) {
			System.out.println("Nhap thong tin tam giac " +(i+1));
			t[i].nhapTT();
		}
		for(int i=0; i<r.length; i++)
			System.out.println(r[i].toString());
		
		for(int i=0;i<t.length;i++)
			System.out.println(t[i].toString());		
}			
}
