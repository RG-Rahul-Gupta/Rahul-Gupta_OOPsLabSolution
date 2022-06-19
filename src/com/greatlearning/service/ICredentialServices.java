package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface ICredentialServices {
	
	String generatePassword();
	
	String generateEmailID(String firstName, String lastName, String department);
	
	void showCredentials(Employee employee, String email, String password);
	
	

}
