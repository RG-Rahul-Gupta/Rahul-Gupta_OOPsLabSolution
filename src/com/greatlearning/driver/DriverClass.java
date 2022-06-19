package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
	private static final CredentialService credentialservice = new CredentialService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Registration Wizard");
		System.out.println("Please Enter your First Name ");
		String firstName = sc.nextLine();
		System.out.println("Please Enter your Last Name ");
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName);
		String emailID;
		String password;

		System.out.println("Please Enter the Department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		int departmentno = sc.nextInt();

		switch (departmentno) {
		case 1: {
			emailID = credentialservice.generateEmailID(firstName, lastName, "Technical");
			password = credentialservice.generatePassword();
			credentialservice.showCredentials(employee, emailID, password);
		}
			break;
		case 2: {
			emailID = credentialservice.generateEmailID(firstName, lastName, "Admin");
			password = credentialservice.generatePassword();
			credentialservice.showCredentials(employee, emailID, password);
		}
			break;
		case 3: {
			emailID = credentialservice.generateEmailID(firstName, lastName, "HR");
			password = credentialservice.generatePassword();
			credentialservice.showCredentials(employee, emailID, password);
		}
			break;
		case 4: {
			emailID = credentialservice.generateEmailID(firstName, lastName, "Legal");
			password = credentialservice.generatePassword();
			credentialservice.showCredentials(employee, emailID, password);
		}
			break;
		}

	}

}
