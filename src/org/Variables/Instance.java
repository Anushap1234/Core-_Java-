package org.Variables;

import java.util.Scanner;

public class Instance {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
private void empId() {
System.out.println("Hi:"+a);
}
public static void main(String[] args) {
	Instance in=new Instance();
	in.empId();
	System.out.println(in.a);
	
}
}
