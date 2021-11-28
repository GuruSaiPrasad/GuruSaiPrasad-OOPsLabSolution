package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.bean.Employee;
import com.greatlearning.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp=null;
		
		System.out.print("Enter the Firstname ");
		String firstName=sc.next();
		System.out.print("Enter the Last Name");
		String lastName=sc.next();
		System.out.println("Please enter the department from the following option ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: emp=new Employee(firstName, lastName, "tech");
					break;
		case 2: emp=new Employee(firstName,lastName,"admin");
		 			break;
		case 3: emp=new Employee(firstName, lastName, "hr");
		 			break;
		case 4: emp=new Employee(firstName, lastName, "le");
		 			break;
		 default: System.out.println("Invalid Option");
		 			break;
		}
		
		CredentialService cs=new CredentialService();
		String email=cs.generateEmail(emp);
		String password=cs.generatePassword();
		System.out.println("Please wait for a while until password is generated");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cs.showCredentials(emp, email, password);
	}

}
