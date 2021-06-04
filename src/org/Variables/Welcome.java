package org.Variables;

import java.util.Scanner;

public class Welcome {

public void wlcome() {
	String s1,s2,s3;
	s3="welcome";
	System.out.println(s3);
	Scanner s=new Scanner(System.in);
	
	System.out.println("Do you want to print the message again y/n:");
	s1=s.next();
	//System.out.println(s1);
	s2="y";
	if (s1.equals(s2)) {
		wlcome();
		
	}
	 else if (s1.equals("n")) {
		
	} 
		
	
}
public static void main(String[] args) {
	Welcome w=new Welcome();
	w.wlcome();

}

}
