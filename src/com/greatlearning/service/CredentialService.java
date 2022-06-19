package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService implements ICredentialServices {

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcedfghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters ="!@#$%^&*()_+{}:<>,.";
		String value = capitalLetters + smallLetters + numbers + specialCharacters;
		//randomly select a combination of all these different type of characters 
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		for(int index = 0; index<8; index++) {
			int randomCharacter = random.nextInt(value.length());
			strBuffer.append(value.charAt(randomCharacter));
		}
		return strBuffer.toString();
	}

	@Override
	public String generateEmailID(String firstName, String lastName, String department) {

		return firstName+lastName+"@"+department+".abc.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String password) {
	System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
	System.out.println("Email-ID -> "+email);
	System.out.println("Password -> "+password);
	}

	

}
