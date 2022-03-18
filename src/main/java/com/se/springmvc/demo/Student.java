package com.se.springmvc.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private ArrayList<String> operatingSystemOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United Satte");
		
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		
		operatingSystemOptions = new ArrayList<String>();
		operatingSystemOptions.add("Linux");
		operatingSystemOptions.add("Mac OS");
		operatingSystemOptions.add("MS Windows");
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}


	public ArrayList<String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}


//	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
//		this.countryOptions = countryOptions;
//	}


//	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
//		this.favoriteLanguageOptions = favoriteLanguageOptions;
//	}
//
//
//	public void setOperatingSystemOptions(ArrayList<String> operatingSystemOptions) {
//		this.operatingSystemOptions = operatingSystemOptions;
//	}
	
}
