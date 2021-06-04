package org.AccessSpecifier1;

import org.AccessSpecifier.Employee;

public class Company1 extends Employee{
public static void main(String[] args) {
	Employee e=new Employee();
	e.empName();
	
	Company1 c1=new Company1();
	c1.empAddress();
	c1.empName();
	
}
}
