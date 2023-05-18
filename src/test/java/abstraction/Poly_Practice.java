package abstraction;

public class Poly_Practice {
	
	public void getEmployee(String name,int age) {
		System.out.println(name + age);
	
	}
	public void getEmployee(int age,String name) {
		System.out.println(age+name);	
		
		
	}
	
public static void main(String[] args) {
	Poly_Practice obj = new Poly_Practice();
	obj.getEmployee(40, "farhana");
	obj.getEmployee("afroza", 22);
}	
	
	
}
