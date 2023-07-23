package com.enums;

public enum TestData {

	InValidEmail("test@test.com"),
	ValidEmail("02asmitadixit@gmail.com"),
	Password("Test@123"),
	Note("This is my first note");

	private String value;

	TestData(String value){
		this.value =value;
	}
	public String getValue(){
		return value;
	}

}

