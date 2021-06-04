package org.AccessSpecifier;

public class Employee {
	
public void empName() {
	System.out.println("Anusha");

}
private void empId() {
	System.out.println("12345");

}
 void empMail() {
	System.out.println("Anusha@gmail.com");

}
 protected void empAddress() {
System.out.println("Siruseri");
}
 public static void main(String[] args) {
	Employee e=new Employee();
	e.empName();
	e.empId();
	e.empMail();
	e.empAddress();
}
}
