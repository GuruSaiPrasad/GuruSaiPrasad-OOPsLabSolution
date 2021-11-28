package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.bean.Employee;

public class CredentialService {
public String generateEmail(Employee e)
{
	return e.getFirstName().toLowerCase()+e.getLastName().toLowerCase()+"@"+e.getDepartmentName().toLowerCase()+".abc.com";
}
public String generatePassword() {
	String passwordCharacters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
	Random random =new Random();
	char[] password=new char[8];
	for(int i=0;i<8;i++) {
		int n=random.nextInt(passwordCharacters.length());
		password[i]=passwordCharacters.charAt(n);
	}
	return String.valueOf(password);
}
public void showCredentials(Employee e,String email, String password)
{
System.out.println("Dear "+e.getFirstName()+" your generated credentials as follows ");
System.out.println("Email  --->"+email);
System.out.println("Password  --->"+password);
}
}
