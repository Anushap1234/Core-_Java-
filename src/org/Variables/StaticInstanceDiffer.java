package org.Variables;

public class StaticInstanceDiffer {
static int a=10;
int b=20;
private void empName() {
	System.out.println(a);
	System.out.println(b);
a++;
b++;
}
public static void main(String[] args) {
	StaticInstanceDiffer sI=new StaticInstanceDiffer();
	sI.empName();
	StaticInstanceDiffer sI1=new StaticInstanceDiffer();
	sI1.empName();
	StaticInstanceDiffer sI2=new StaticInstanceDiffer();
	sI2.empName();
}
}
